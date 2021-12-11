package hanshushi_interface.changyong;

import java.util.function.Predicate;

/*
    Predicate<T>接口通常用于判断参数是否满足指定的条件

    Predicate<T>：常用的四个方法
        boolean test(T t);  对给定的参数进行判断，(判断逻辑由Lambda表达式实现)，返回一个布尔值
        default Predicate<T> negate();  返回一个逻辑的否定，对应逻辑非

 */
public class Predicate_1 {
    public static void main(String[] args) {
        //匿名内部类
//        boolean b1 = checkString("hello", new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 5;
//            }
//        });

        //Lambda表达式优化版
        boolean b1 = checkString("hello", s -> s.length() > 5);

        boolean b2 = checkString("hello, liubo", s -> s.length() > 5);

        System.out.println(b1);
        System.out.println(b2);
    }

    private static boolean checkString(String s, Predicate<String> pr){
//        return pr.test(s);

        //如果想实现返回相反的布尔值
//        return !pr.test(s);
        return pr.negate().test(s);//二者等价

        //negate()的源码就是加个!
        /*default Predicate<T> negate() {
            return (t) -> !test(t);
        }*/
    }
}
