package hanshushi_interface.changyong;

import java.util.function.Consumer;

public class Consumer_Test {
    public static void main(String[] args) {
        String[] namess = {"刘博,19", "煤球,20", "高辉,19"};

        //匿名内部类
        putString(namess, new Consumer<String>() {
            @Override
            public void accept(String s) {
                String name = s.split(",")[0];
                System.out.print("年龄:" + name);
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                int age = Integer.parseInt(s.split(",")[1]);
                System.out.println(",年龄:" + age);
            }
        });

        System.out.println("---------------------");

        //Lambda表达式
        putString(namess, (String s) -> {
            String name = s.split(",")[0];
            System.out.print("年龄:" + name);
        }, (String s) -> {
            int age = Integer.parseInt(s.split(",")[1]);
            System.out.println(",年龄:" + age);
        });

        System.out.println("---------------------");

        //Lambda表达式优化
        putString(namess, s -> System.out.print("年龄:" + s.split(",")[0]),
                s -> System.out.println(",年龄:" + Integer.parseInt(s.split(",")[1])));
    }

    private static void putString(String[] names, Consumer<String> s, Consumer<String> s2){
//        s.accept(names);
//        s2.accept(names);
        for(String name : names) {
            s.andThen(s2).accept(name);
        }
    }

}
