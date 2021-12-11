package jihe.myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*   Collections 集合概述：
*           是针对集合操作的工具类
*
*   Collections 集合常用方法：
*       public static <T extends Comparable<? super T>> void sort(List<T> list)
*           将指定的列表按升序排序 注：列表中的所有元素都必须实现 Comparable 接口
*       public static <T> void sort(List<T> list,Comparator<? super T> c)
*           跟上一个基本相同，但这个是在调用方法时重写compare方法，上一个是在元素类中重写compareTo方法
*       public static void reverse(List<?> list)
*           反转指定列表中元素的顺序
*       public static void shuffle(List<?> list)
*           使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的。
*       */
public class myCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);

        //public static <T extends Comparable<? super T>> void sort(List<T> list)
        //*   将指定的列表按升序排序 注：列表中的所有元素都必须实现 Comparable 接口
//        Collections.sort(list);

        // public static void reverse(List<?> list)
        //*   反转指定列表中元素的顺序
//        Collections.reverse(list);

        //public static void shuffle(List<?> list)
        //*   使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的。
        Collections.shuffle(list);

        System.out.println(list);
    }
}
