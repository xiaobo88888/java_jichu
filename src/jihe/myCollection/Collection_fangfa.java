package jihe.myCollection;

import java.util.ArrayList;
import java.util.Collection;

/*Collection集合中常用的方法
*
*     boolean add(E a); 在末尾添加元素
*     boolean remove(Object o);从集合中删除指定元素
*     void clear();清空集合的元素
*     boolean contains(Object o);判断集合中是否存在指定元素
*     boolean isEmpty();判断集合是否为空
*     int size();得到集合长度，也就是集合的元素个数
*
*     Alt+7  打开一个窗口，能够看到类的所有信息
* */

public class Collection_fangfa {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        //boolean add(E a); 添加元素
        System.out.println(c.add("hello"));
        System.out.println(c.add("hello"));
        c.add("world");

        //boolean remove(Object o);从集合中删除指定元素
//        System.out.println(c.remove("hello"));
//        System.out.println(c.remove("java"));

        //void clear();清空集合的元素
//        c.clear();

        //boolean contains(Object o);判断集合中是否存在指定元素
//        System.out.println(c.contains("hello"));
//        System.out.println(c.contains("world"));
//        System.out.println(c.contains("java"));

        //boolean isEmpty();判断集合是否为空
//        System.out.println(c.isEmpty());

        //int size();得到集合长度，也就是集合的元素个数
        System.out.println(c.size());


        //输出集合
        System.out.println(c);
    }
}
