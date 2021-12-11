package jihe.myList;

import java.util.LinkedList;

/*LinkedList的特有功能：
*   public void addFirst(E e);在列表开头插入指定元素
*   public void addLast(E e);在列表结尾插入指定元素
*   public E getFist();返回列表中第一个元素
*   public E getLast();返回列表中最后一个元素
*   public E removeFirst();删除列表中的第一个元素并将其返回
*   public E removeLast();删除列表中的最后一个元素并将其返回
* */
public class List_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("hello");
        link.add("world");
        link.add("java");

//        //public void addFirst(E e);在列表开头插入指定元素
//        link.addFirst("hi");
//        //public void addLast(E e);在列表结尾插入指定元素
//        link.addLast("javaee");

//        //public E getFist();返回列表中第一个元素
//        System.out.println(link.getFirst());
//        //public E getLast();返回列表中最后一个元素
//        System.out.println(link.getLast());

//        //public E removeFirst();删除列表中的第一个元素并将其返回
//        System.out.println(link.removeFirst());
//        //public E removeLast();删除列表中的最后一个元素并将其返回
//        System.out.println(link.removeLast());

        System.out.println(link);
    }
}
