package jihe.fanxing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*   泛型概述：泛型的本质时参数化类型，就是将类型由原来的具体的类型参数化，然后在使用和调用时传入具体类型
*
*           这种泛型可以用在类，方法，接口中，成为泛型类，泛型方法，泛型接口
*
*   泛型定义格式：
*       <类型> ：指定一种类型的格式，这里的类型可以看成是形参
*       <类型1，类型2...> ： 指定多种类型的格式，多种类型用逗号隔开
*
*       这里的类型可以看成是形参，将来具体调用的时候给定的类型可以看成是实参，并且实参数据类型只能是引用数据类型
*
*   泛型的好处：把运行时期的问题提前到了编译时期
*             避免了强制类型转换*/
public class fanxing_Demo {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c = new ArrayList();//因为集合创建的时候没有指定类型，所以可以存储任意类型
        Collection<String> c = new ArrayList<String>();//现在指定了元素类型了
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);//假如这里给了一个Integer类型
        //所以这里存储Integer类型就会报错了，就由运行时异常转为编译时异常

        //遍历元素
//        Iterator i = c.iterator();//迭代器遍历
        Iterator<String> i = c.iterator();//这里生成的迭代器也是指定类型的了
        while (i.hasNext()) {
//            Object s = i.next();//因为没有指定类型，所以这里Ctrl + Alt + v 自动生成的是Object
//            System.out.println(s);
            //ClassCastException  隐式类型转换报错
            //但这里又强转为String类型，所以会在运行时报错
//            String s =(String)i.next();//向下强转
            String s = i.next();//而这里也不需要强转了
            System.out.println(s);
        }
    }
}
