package Stream_.zhongjian;

import java.util.ArrayList;
import java.util.Comparator;

/*
    Stream <T> sorted();  返回由此流的元素组成的流，根据自然顺序排序
    Stream <T> sorted(Comparator comparator);  返回由此流的元素组成的流，根据提供的Comparator
        Comparator接口中的方法 int compare(T o1, T o2);
 */
public class sorted_ {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("aaaaaaaaaa");
        arr.add("bbb");
        arr.add("c");
        arr.add("dddddddddddddd");
        arr.add("eeeeeee");
        arr.add("baaaaaa");

        //按照字母顺序把数据在控制台输出
        arr.stream().sorted().forEach(System.out::println);
        System.out.println("-------------------");
        //按照字符串长度把数据在控制台输出
        arr.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }).forEach(System.out::println);
        System.out.println("---------------------");

        arr.stream().sorted((o1, o2) -> o1.length() - o2.length()).forEach(System.out::println);
        System.out.println("-------------------");

        arr.stream().sorted((o1, o2) -> {
            int num = o1.length() - o2.length();
            int num2 = num == 0 ? o1.compareTo(o2) : num;
            return num2;
        }).forEach(System.out::println);
    }
}
