package Stream_.zhongjian;


import java.util.ArrayList;

/*
    filter可以解释为如果返回true，则保留元素，如果返回false，则删除元素
 */
public class filter_ {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘博");
        list.add("高辉");
        list.add("煤球");
        list.add("刘可馨");
        list.add("刘涵伟");

        //将list集合中已刘开头的元素在控制台输出

        list.stream().filter((String s) -> {
            return s.startsWith("刘");
        }).forEach(System.out::println);

        System.out.println("--------------");

        //把list集合中长度为3的元素在控制台输出
        list.stream().filter((String s) -> {
            return s.length() == 3;
        }).forEach(System.out::println);

        System.out.println("--------------");

        //把list集合中以刘开头，长度为3的元素在控制台输出
        list.stream().filter((String s) -> {
            return s.startsWith("刘");
        }).filter((String s) -> {
            return s.length() == 3;
        }).forEach(System.out::println);
    }
}
