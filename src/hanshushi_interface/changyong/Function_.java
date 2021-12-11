package hanshushi_interface.changyong;

import java.util.function.Function;

/*
    Function<T, R>   接口通常用于对参数进行处理、转换(处理逻辑由Lambda表达式实现)，然后返回一个新的值

    Function<T, R>:
        R apply(T t);  将此函数应用于给定的参数
        default <V> Function andThen(Function after); 返回一个组合函数，首先将该函数应用于输入，然后将after应用于输出

 */
public class Function_ {
    public static void main(String[] args) {
        //需求一
        con("100", s -> Integer.parseInt(s));
        con("100", Integer::parseInt);

        //需求二
        con(100, i -> String.valueOf(i + 11));

        //需求三
        con("100", s -> Integer.parseInt(s), i -> String.valueOf(i + 20));
    }

    //定义一个方法，把一个字符串转化成int类型，然后在控制台输出
    private static void con(String s, Function<String, Integer> fun){
        int a = fun.apply(s);
        System.out.println(a);
    }

    //定义一个方法，把一个int类型的数据加上一个整数后，转化为字符串在控制台输出
    private static void con(int num, Function<Integer, String> fun){
        String s = fun.apply(num);
        System.out.println(s);
    }

    //定义一个方法，把一个字符串转为int类型，把int类型的数据加上一个整数后，转化成字符串在控制台输出
    private static void con(String s, Function<String, Integer> fun, Function<Integer, String> fun2){
//        Integer i = fun.apply(s);
//        String ss = fun2.apply(i);
//        System.out.println(ss);

        String ss = fun.andThen(fun2).apply(s);
        System.out.println(ss);

        /*
        default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
            Objects.requireNonNull(after);
            return (T t) -> after.apply(apply(t));
        }
         */
    }
}
