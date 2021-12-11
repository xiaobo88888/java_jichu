package jihe.myList;

import java.util.ArrayList;
import java.util.List;

/*List集合的特有方法：(Collection集合是没有的，但是List集合的实现类ArrayList有这些方法)
      void add(int Index, E element);在此集合中的指定位置(Index)插入指定元素(element)
      E remove(int Index);删除指定位置的元素，返回被删除的元素
      E set(int Index, E element);修改指定位置的元素，返回被修改的元素
      E get(int Index);返回指定索引处的元素
*/
public class List_fangfa_teyou {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add(int Index, E element);在此集合中的指定位置(Index)插入指定元素(element)
//        list.add(1, "javaee");
        //IndexOutOfBoundsException索引越界
//        list.add(11, "javaee");

        //E remove(int Index);删除指定位置的元素，返回被删除的元素
//        System.out.println(list.remove(1));
        //IndexOutOfBoundsException索引越界
//        System.out.println(list.remove(22));

        //E set(int Index, E element);修改指定位置的元素，返回被修改的元素
//        System.out.println(list.set(0, "hi"));
        //IndexOutOfBoundsException索引越界
//        System.out.println(list.set(33, "aaa"));

        //E get(int Index);返回指定索引处的元素
//        System.out.println(list.get(1));
        //IndexOutOfBoundsException索引越界
//        System.out.println(list.get(44));

        //输出集合
        System.out.println(list);

        //遍历集合(非迭代器遍历)
        for (int i = 0; i < list.size(); i++){//size()方法，Collection方法，被List继承，所以可以使用
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
