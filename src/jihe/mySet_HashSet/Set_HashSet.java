package jihe.mySet_HashSet;

import java.util.HashSet;
import java.util.Iterator;

/*HashSet集合特点：
*       底层数据结构是哈希表
*       对底层的迭代顺序不做任何保证，也就是说不保证存储和取出的顺序一致
*       没有带索引的方法，所以不能使用普通for索引遍历
*       由于是Set集合的实现类，所以不包含重复的元素*/
public class Set_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        //由于是Set集合的实现类，所以不包含重复的元素
        hs.add("java");

        //对底层的迭代顺序不做任何保证，也就是说不保证存储和取出的顺序一致
        Iterator<String> it = hs.iterator();//采用Collection的迭代器遍历
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        for(String s : hs){
            System.out.println(s);
        }
    }
}
