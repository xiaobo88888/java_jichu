package Stream_;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Stream流的收集方法：
        R collect(Collector collector);

    Collector接口有一个实现工具类Collectors
        public static <T> toList();  将元素收集到List集合中
        public static <T> toSet();  将元素收集到Set集合中
        public static <T> toMap(Function keyMapper, Function valueMapper);  将元素收集到Map集合中
 */
public class shouji {
    public static void main(String[] args) {
        //创建List集合
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘博");
        list.add("高辉");
        list.add("煤球");
        list.add("刘可馨");
        list.add("刘涵伟");

        //需求一：得到名字为三个字的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);

        //需求二：把使用的Stream流操作完毕的数据收集到List集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for(String s : names){
            System.out.println(s);
        }

        System.out.println("----------------");

        //创建Set集合
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(10);
        set.add(4);
        set.add(19);
        set.add(30);
        set.add(40);

        //需求一：得到年龄大于15的流
        Stream<Integer> setStream = set.stream().filter(i -> i >= 15);

        //需求二：把使用Stream流操作完毕的数据收集到Set集合中并遍历
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for(int i : ages){
            System.out.println(i);
        }

        System.out.println("----------------");

        //创建字符串数组
        String[] NameAge = {"刘博,19", "煤球,20", "高辉,19"};

        //需求一：得到字符串中年龄数据大于19的流
        Stream<String> NameAgeStream = Stream.of(NameAge).filter(s -> Integer.parseInt(s.split(",")[1]) > 19);

        //将收集到的Stream流收集到Map集合中并遍历
        Map<String, Integer> mapStream = NameAgeStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> mapStreamKeys= mapStream.keySet();
        for(String key : mapStreamKeys){
            Integer value = mapStream.get(key);
            System.out.println("姓名:" + key + "  年龄:" + value);
        }
    }
}
