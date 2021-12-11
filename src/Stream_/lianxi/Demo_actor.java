package Stream_.lianxi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo_actor {
    public static void main(String[] args) {

        //创建ArrayList对象
        ArrayList<String> listman = new ArrayList<String>();
        ArrayList<String> listwoman = new ArrayList<String>();

        listman.add("刘博");
        listman.add("刘文辉");
        listman.add("邹文昌");
        listman.add("杨杰");
        listman.add("高辉");
        listman.add("温子昇");
        listwoman.add("煤球");
        listwoman.add("刘可馨");
        listwoman.add("刘一涵");
        listwoman.add("蒋雯佳");
        listwoman.add("朱林燕");
        listwoman.add("刘慧");

        /*
        //男演员取前三人且名字三个字
        Stream<String> list1 = listman.stream().limit(3).filter(s -> s.length() == 3);

        //女演员跳过第一个取姓刘的
        Stream<String> list2 = listwoman.stream().skip(1).filter(s -> s.startsWith("刘"));

        //把过滤后的男女演员姓名合并到一起
        Stream<String> lists = Stream.concat(list1, list2);

        //将集合中的元素创建actor对象，遍历数据
       // lists.map(s -> new actor(s)).forEach(a -> System.out.println(a.getName()));

        //用方法引用
        lists.map(actor::new).forEach(a -> System.out.println(a.getName()));
         */

        //综合操作
        Stream.concat(listman.stream().limit(3).filter(s -> s.length()==3),
                listwoman.stream().skip(1).filter(s -> s.startsWith("刘")))
                .map(actor::new).forEach(a -> System.out.println(a.getName()));
    }
}
