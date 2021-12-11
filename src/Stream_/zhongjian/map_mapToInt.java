package Stream_.zhongjian;

import java.util.ArrayList;
import java.util.function.Function;

/*
    <R> Stream <R> map(Function mapper);  返回由给定函数应用与此流的元素的结果组成的流
        Function接口中的方法  R apply(T t);
    IntStream mapToInt(ToIntFunction mapper);  返回一个IntStream其中包含给定函数应用于此流的元素的结果
        IntStream:原始的int流
        ToIntFunction接口中的方法  int applyAsInt(T value)
 */
public class map_mapToInt {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //需求：将集合中的字符数据转换成整数后在控制台输出
        //匿名内部类
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);
        System.out.println("--------------------");

        //Lambda表达式
        list.stream().map((s -> Integer.parseInt(s))).forEach(System.out::println);
        System.out.println("--------------------");

        //方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("--------------------");

        //mapToInt方法
        //IntStream mapToInt(ToIntFunction mapper);
        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        //IntStream流中有一个方法：int sum();  返回此流中元素的总和
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("--------------------");

        System.out.println(sum);

    }
}
