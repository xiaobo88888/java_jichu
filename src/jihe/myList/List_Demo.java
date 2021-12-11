package jihe.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*概述：
* Interface List<E>
  List集合继承自Collection集合

  List是一个有序集合(序列)，用户可以精确控制列表中每个元素的插入位置，可以通过整数索引列表中的位置访问元素
   并搜索列表中的元素

  与Set集合不同，List结合允许出现重复元素
  *
  特点：
  有序：存储和取出的顺序一致
  可重复：存储的元素可以重复
*/
public class List_Demo {
    public static void main(String[] args) {
        //创建List集合对象
        List<String> list = new ArrayList<String>();//这也是通过多态创建对象

        //插入元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //输出集合
        System.out.println(list);

        //遍历集合
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
