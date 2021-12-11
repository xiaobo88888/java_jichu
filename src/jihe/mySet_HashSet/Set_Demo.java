package jihe.mySet_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*public interface Set<E> extends Collection <E>
    Set集合的特点：
*           不包含重复元素的集合
*           没有带索引的方法，所以不能使用普通for循环索引遍历
*   HashSet:Set集合的一个实现类
*           对集合的迭代顺序不做任何保证*/
public class Set_Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");
        //没有带索引的方法，所以不能使用普通for循环索引遍历
        set.add("java");//不会打印出来

        //迭代器遍历 使用Collection的迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String ss = it.next();
            System.out.println(ss);
        }
        //for-each遍历
        for(String s : set){
            System.out.println(s);
        }
    }
}
