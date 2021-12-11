package hanshushi_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    public static <T> void sort(List<T> list, Comparator<? super T> c)
        根据指定比较器产生的顺序对指定列表进行排序。


    @FunctionalInterface
    public interface Comparator<T> {}
 */
public class return_zhi {
    public static void main(String[] args) {
        //构造使用场景

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("aaaa");
        arr.add("b");
        arr.add("ccccc");
        arr.add("dd");

        Collections.sort(arr);

        System.out.println("比较器排序前" + arr);//默认排序

        Collections.sort(arr, getComparator());

        System.out.println("比较器排序后" + arr);//比较器排序
    }

    private static Comparator<String> getComparator(){
        //匿名内部类实现
//        Comparator<String> com = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//        return com;

        //匿名内部类优化
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };

        //Lambda表达式实现
//        return (String s1, String s2) ->{
//            return s1.length() - s2.length();
//        };

        //Lambda表达式优化
        return (s1, s2) -> s1.length() - s2.length();
    }
}
