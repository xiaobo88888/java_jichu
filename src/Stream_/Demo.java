package Stream_;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘博");
        list.add("高辉");
        list.add("煤球");
        list.add("刘可馨");
        list.add("刘涵伟");

        //普通写法
        ArrayList<String> liulist = new ArrayList<String>();

        for(String s : list){
            if(s.startsWith("刘")){
                /*
                public boolean startsWith(String prefix)
                    测试此字符串是否以指定的前缀开始。
                */
                liulist.add(s);
            }
        }

        ArrayList<String> listlength = new ArrayList<String>();

        for(String s : liulist){
            if(s.length() >= 3){
                listlength.add(s);
            }
        }

        for(String s : listlength){
            System.out.println(s);
        }

        System.out.println("-----------------");

        //Stream流
        list.stream().filter(s -> s.startsWith("刘")).filter(s -> s.length() >= 3).forEach(s -> System.out.println(s));

        System.out.println("-----------------");

        //Stream流改进
        list.stream().filter(s -> s.startsWith("刘")).filter(s -> s.length() >= 3).forEach(System.out::println);
    }
}
