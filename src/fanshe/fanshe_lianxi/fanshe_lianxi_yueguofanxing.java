package fanshe.fanshe_lianxi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    在一个ArrayList<Integer>集合中添加字符串数据
 */
public class fanshe_lianxi_yueguofanxing {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //添加正常数据
        arr.add(10);
        arr.add(20);

        //得到类的Class对象
        Class<? extends ArrayList> arrClass = arr.getClass();

        //得到类的方法
        Method add = arrClass.getDeclaredMethod("add", Object.class);


        //添加字符串数据
        add.invoke(arr, "hello");
        add.invoke(arr, "world");
        add.invoke(arr, "java");

        //输出集合
        System.out.println(arr);
    }
}
