package ArrayList_Test;

/*
* public boolean remove(index)  删除指定位置元素，返回删除是否成功
* public E remove(O)  删除指定元素，返回被删除的元素
* public E set(index, O)  修改指定位置的元素，返回被修改的元素
* public E get(index)  返回指定位置的元素
* public int size()   返回元素个数
*/
import java.util.ArrayList;

public class Xiugai {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add("hello");
        a.add("world");
        a.add("java");

        //删除元素
//        a.remove(1);//删除指定位置元素
        //删除指定位置元素可能导致索引越界
//        System.out.println(a.remove("java"));//删除指定元素

        //修改元素
//        System.out.println(a.set(1, "javaee"));//修改指定位置的元素
        //修改指定位置的元素可能导致索引越界

        //返回元素
        System.out.println(a.get(0));//返回指定位置的元素
        //同样可能导致索引越界

        //返回元素个数
        System.out.println(a.size());

        System.out.println(a);

    }
}
