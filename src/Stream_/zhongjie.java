package Stream_;

import java.util.ArrayList;

/*
    Stream流中常见终结操作方法：
        void forEach(Consumer action);  对此流的每个元素执行操作
            Consumer接口中的方法   void accept(T t):对给定的参数执行此操作
        long count();  返回此流中的元素数
 */
public class zhongjie {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘博");
        list.add("高辉");
        list.add("煤球");
        list.add("刘可馨");
        list.add("刘涵伟");

        //需求一：把集合中的元素在控制台输出
        list.stream().forEach(System.out::println);

        //需求二：统计集合中由几个以张开头的元素，并把统计结果在控制台输出
        long num = list.stream().filter(s -> s.startsWith("刘")).count();
        System.out.println(num);

    }
}
