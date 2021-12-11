package hanshushi_interface.changyong;

import java.util.function.Predicate;

/*
    Predicate<T>:
        default Predicate<T> and (Predicate other);  返回一个组合判断，对应短路与
        default Predicate<T> or (Predicate other);  返回一个组合判断，对应短路或
 */
public class Predicate_2 {
    public static void main(String[] args) {
        boolean b = checkStringAnd("hello", s -> s.length() > 10, s -> s.length() < 15);
        System.out.println(b);


        boolean b2 = chekStringOr("hello", s -> s.length() > 10, s -> s.length() < 15);
        System.out.println(b2);

    }

    //同一个字符串给出两个不同的判断条件，最后把这两个判断的结果做逻辑与运算的结果作为最终的结果
    private static boolean checkStringAnd(String s, Predicate<String> p1, Predicate<String> p2){
//        boolean b1 = p1.test(s);
//        boolean b2 = p2.test(s);
//        boolean b = b1 && b2;
//        return b;

        return p1.and(p2).test(s);

        /* 源码做的就是加个&&(逻辑与)
        default Predicate<T> and(Predicate<? super T> other) {
            Objects.requireNonNull(other);
            return (t) -> test(t) && other.test(t);
        }
         */
    }

    private static boolean chekStringOr(String s, Predicate<String> p1, Predicate<String> p2){
        return p1.or(p2).test(s);

        /* 源码就是加个||(逻辑或)
        default Predicate<T> or(Predicate<? super T> other) {
            Objects.requireNonNull(other);
            return (t) -> test(t) || other.test(t);
        }
         */
    }
}
