package jihe.myCollection;

/*
*     Iterator ：对 collection 进行迭代的迭代器，集合的专用遍历方式
*          Iterator<E> iterator();  返回此集合中元素的迭代器，通过集合的iterator方法得到
*          集合的iterator是通过集合得到的，所以该方法依赖于集合而存在
*     Iterator<E> 是一个接口
*
*     Iterator的常用方法：
*          E next(); 返回迭代器中的下一个元素
*          boolean hasNext(); 如果迭代器中有更多的元素，则返回true
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_bianli {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //Iterator<E> iterator();  返回此集合中元素的迭代器，通过集合的iterator方法得到
        Iterator<String> i = c.iterator();//这个iterator方法返回的是Iterator<E>的实现类Itr的对象，是一种多态的方式
        //这里的类型E和集合的类型一致
        /*
        *  public Iterator<E> iterator() {
                return new Itr();
            }
            private class Itr implements Iterator<E> {
                ...
            }
        */

        //E next(); 返回迭代器中的下一个元素
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());

        //boolean hasNext(); 如果迭代器中有更多的元素，则返回true
//        if(i.hasNext()){
//            System.out.println(i.next());
//        }
//        if(i.hasNext()){
//            System.out.println(i.next());
//        }
//        if(i.hasNext()){
//            System.out.println(i.next());
//        }
//        if(i.hasNext()){
//            System.out.println(i.next());
//        }

        //采用while循环的方法遍历元素
        while(i.hasNext()){
//            System.out.println(i.next());
            String s = i.next();
            System.out.println(s);//如果要对元素操作就比较方便
        }
    }


}
