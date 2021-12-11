package Stream_.zhongjian;

import java.util.ArrayList;

/*
    Stream<T> limit(long maxSize);  返回此流中的元素组成的流，截取前指定参数个数的数据
    Stream<T> skip(long n);   跳过指定参数个数的数据，返回由该流的剩余元素组成的流
 */
public class limit_skip {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘博");
        list.add("高辉");
        list.add("煤球");
        list.add("刘可馨");
        list.add("刘涵伟");

        //需求一：取前三个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("----------------");

        //需求二：跳过三个元素，将剩下的三个元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("-----------------");

        //需求三：跳过两个元素，将剩下的元素中的前两个在控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
