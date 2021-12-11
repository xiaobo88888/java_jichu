package fanshe.huoqu_fangfa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class huoqu_fangfa_lianxi1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //先得到类的Class对象
        Class<?> studentClass = Class.forName("fanshe.Student");

        //得到类的对象
        Constructor<?> constructor = studentClass.getConstructor();
        Object obj = constructor.newInstance();

        //得到类的成员方法的对象
        Method method = studentClass.getMethod("method");
        Method method2 = studentClass.getMethod("method2", String.class);
        Method method3 = studentClass.getMethod("method3", String.class, int.class);
        Method function = studentClass.getDeclaredMethod("function");

        //暴力反射
        function.setAccessible(true);

        //通过成员方法的对象调用成员方法
        method.invoke(obj);
        method2.invoke(obj, "lalala");
        Object return1 = method3.invoke(obj, "yeyeye", 100);
        function.invoke(obj);

        //将有返回值的方法的返回值输出
        System.out.println(return1);

    }
}
