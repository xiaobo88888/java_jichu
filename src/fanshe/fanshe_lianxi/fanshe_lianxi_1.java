package fanshe.fanshe_lianxi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class fanshe_lianxi_1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);

        //获取类的Class对象——通过对象调用getClass()方法可以得到对象对应的类的Class对象
        Class<? extends Set> setClass = set.getClass();

        //通过类的Class对象可以得到类中的方法对象
        Method add = setClass.getDeclaredMethod("add", Object.class);

        //通过类的方法对象调用方法，参数需要类的对象和方法的实参
        add.invoke(set, "hello");
        add.invoke(set, true);
        add.invoke(set, 11.8);

        //然后就可以输出集合了
        System.out.println(set);

    }
}
