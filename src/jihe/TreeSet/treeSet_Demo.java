package jihe.TreeSet;

/*
*   TreeSet集合特点：
*               1.元素有序，这里的顺序不是存储和取出顺序，而是按照移动顺序对元素排序，具体排序方法取决与
*                 构造方法
*                   TreeSet();根据元素的自然排序进行排序
*                   TreeSet(Comparator comparator);根据指定的比较器进行排序
*               2.没有带索引的方法，所以不能通过普通for循环遍历
*               3.由于是Set集合，所以不包含重复元素*/

import java.util.TreeSet;

public class treeSet_Demo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();//集合类型只能用引用，所以这里得用int的包装类

        //这里会自动装箱
        ts.add(30);
        ts.add(40);
        ts.add(10);
        ts.add(20);
        ts.add(50);
        //不包含重复元素
        ts.add(40);

        for (Integer i : ts){
            System.out.println(i);
        }
    }
}
