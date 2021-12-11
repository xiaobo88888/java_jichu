package jihe.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* ConcurrentModificationExceptio 继承自RuntimeException，属于运行时期异常
*   当不允许这样的修改时，可以通过检测到对象并发修改方法来抛出异常——并发修改异常
*   产生的原因：迭代器遍历集合元素时，通过集合对象修改了集合长度，造成了迭代器获取元素中判断预期修改值与实际修改值不一致
*   解决方案：用for循环遍历，然后用集合对象做对应操作即可
* */
public class List_throws_bingfa {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        Iterator<String> it = list.iterator();

        //ConcurrentModificationExceptio并发修改异常
//        while(it.hasNext()){
//            String s = it.next();//这里会判断预期修改次数与实际修改次数是否一致
//            if(s.equals("java")){
//                list.add("javaee");
//            }
//        }
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);//但是这里不需要判断
            if(s.equals("java"))
                list.add("javaee");
        }

        System.out.println(list);
    }
}
