package hanshushi_interface.changyong;

import java.io.PrintStream;
import java.util.function.Consumer;

/*
    Consumer<T>:包含两个方法
        void accept(T t);对给定的参数执行此操作(在Lambda表达式中执行)
        default Consumer<T> andThen(Consumer after);返回一个组合的Consumer，依次执行此操作，然后执行after操作
        Consumer<T>接口也被称为消费性接口，它消费的数据的数据类型由泛型指定
 */

/*
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
        //先做依次accept(t),又做了依次after.accept(t);
    }
 */
public class Consumer_ {
    public static void main(String[] args) {
        //匿名内部类实现
        putString("刘博", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Lambda表达式实现
        putString("刘博", (String s) -> {
            System.out.println(s);
        });

        //Lambda表达式优化
        putString("刘博", s -> System.out.println(s));

        //方法引用
        putString("刘博", System.out::println);

        System.out.println("----------------------------");

        //匿名内部类
        putString("刘博", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(new StringBuilder(s).reverse().toString());
            }
        });

        //Lambda表达式
        putString("刘博", (s) -> System.out.println(s), (s) -> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    //定义一个方法，用不同的方式消费同一个字符串两次
    private static void putString(String name, Consumer<String> s, Consumer<String> s2){
//        s.accept(name);
//        s2.accept(name);

        //default Consumer<T> andThen(Consumer after);
        s.andThen(s2).accept(name);
        //s调用andThen方法，传递参数s2,返回一个Consumer实现类对象组合，然后依次调用s、s2的
    }
    //定义一个方法，消费一个字符串
    private static void putString(String name, Consumer<String> s){
        s.accept(name);
    }
}
