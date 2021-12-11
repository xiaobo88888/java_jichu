package jihe.myList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
* ListIterator:列表迭代器
*   通过list集合的listIterator()方法得到，是list集合特有的迭代器
*   用于允许程序员沿任意方向遍历列表的列表迭代器，可以在迭代期间修改列表，并获取列表中迭代器的当前位置
* listIterator的常用方法：
*   E next();返回迭代中的下一个元素
*   boolean hasNext();如果列表中有更多的元素，则返回true
*   E previous();返回列表中的上一个元素
*   boolean hasPrevious();如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回true
*   void add(E e);将指定的元素插入列表
* */
public class List_iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit = list.listIterator();
//        //正序遍历
//        while(lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }
//        //倒序遍历
//        while(lit.hasPrevious()){
//            String ss = lit.previous();
//            System.out.println(ss);
//        }
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("java"))
                lit.add("javaee");
            //这里修改不会出现并发修改异常，因为ListIterator的add方法中会将实际修改次数赋值给预期修改次数，所以不会报错
        }
        System.out.println(list);
    }
}
