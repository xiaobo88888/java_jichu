package hanshushi_interface.changyong;

import java.util.function.Function;

public class Function_Test {
    public static void main(String[] args) {
        con("刘博,19", s -> Integer.parseInt(s.split(",")[1]), i -> i + 20);
    }

    private static void con(String s, Function<String, Integer> fun1, Function<Integer, Integer> fun2){
        int ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
