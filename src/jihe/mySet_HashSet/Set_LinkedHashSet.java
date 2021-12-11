package jihe.mySet_HashSet;

import java.util.LinkedHashSet;

/*  public class LinkedHashSet<E> extends HashSet<E> implements Set<E>
    继承自HashSet<E>集合，实现了Set<E>集合

* LinkedHashSet结合特点：
*       由哈希表和链表实现的Set接口，具有可预测的迭代次序
*       由链表保证元素有序，也就是说元素的存储和取出位置是一致的
*       由哈希表保证元素唯一，也就是说没有重复的元素
*       */
public class Set_LinkedHashSet {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //添加元素
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        lhs.add("java");//没有重复的元素
        //遍历
        for(String s : lhs){//遍历的次序与存入的次序一致
            System.out.println(s);
        }
    }
}
