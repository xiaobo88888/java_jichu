package jihe.myCollection;

import java.util.ArrayList;
import java.util.Collection;

/*创建Collection的对象
*   采用多态的方式
* */
public class Collection_Demo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("liubo");

        System.out.println(c);//[hello, world, liubo]
        //ArrayList集合中重写了toString方法
    }
}
