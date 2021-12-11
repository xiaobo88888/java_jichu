package Stream_.zhongjian;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    static <T> Stream <T> concat(Stream a, Stream b);  合并a,b两个流为一个流
    Stream <T> distinct();   返回由该流的不同元素(Object.equals(Object))组成的流
 */
public class concat_distinct {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘博");
        list.add("高辉");
        list.add("煤球");
        list.add("刘可馨");
        list.add("刘涵伟");

        //需求一：取前四个数据组成一个流
        Stream<String> list2 = list.stream().limit(4);

        //需求二：跳过两个数据组成一个流
        Stream<String> list3 = list.stream().skip(2);

        //需求三：合并需求一和需求二得到的流，并把结果在控制台输出
//        Stream.concat(list2, list3).forEach(System.out::println);

        //如果Stream流调用了终结方法，流的操作就停止了，不能继续使用了

        //需求四：合并需求一和需求二得到的流，并把结果在控制台输出，要求字符串元素不能重复
        Stream.concat(list2, list3).distinct().forEach(System.out::println);
    }

}
