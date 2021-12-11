package jihe.myList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/*List集合常用子类：ArrayList  LinkedList
        ArrayList:底层数据结构是数组，查询快，增删慢
        LinkedList:底层数据结构是链表，查询慢，增删快
* */
public class List_fenlei {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //迭代器遍历
        ListIterator<String> lit = array.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        //普通for索引遍历
        for(int i = 0; i < array.size(); i++){
            String ss = array.get(i);
            System.out.println(ss);
        }
        //增强for，for-each遍历
        for(String sss : array){
            System.out.println(sss);
        }

        System.out.println("-------------");

        LinkedList<String> link = new LinkedList<String>();
        link.add("liubo");
        link.add("meiqiu");
        link.add("gaohui");
        //迭代器遍历
        ListIterator<String> lit2 = link.listIterator();
        while(lit2.hasNext()){
            String s1 = lit2.next();
            System.out.println(s1);
        }
        //普通for索引循环遍历
        for(int i = 0; i < link.size(); i++){
            String ss1 = link.get(i);
            System.out.println(ss1);
        }
        //增强for循环 for-each
        for(String sss1 : link){
            System.out.println(sss1);
        }
    }
}
