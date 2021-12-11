package fanshe.huoqu_fangfa;

import fanshe.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    public Method[] getMethods() throws SecurityException
        返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及
        从超类和超接口继承的那些的类或接口）的公共 member 方法

     Method[] getDeclaredMethods()
          返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、
          默认（包）访问和私有方法，但不包括继承的方法。

     Method getMethod(String name, Class<?>... parameterTypes)
          返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。

     Method getDeclaredMethod(String name, Class<?>... parameterTypes)
          返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。

     Object invoke(Object obj, Object... args)
          对带有指定参数的指定对象调用由此 Method 对象表示的底层方法
 */
public class huoqu_fangfa_ {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        //先得到类的Class对象
        Class<?> studentClass = Class.forName("fanshe.Student");

        //得到类的对象
        Constructor<?> constructor = studentClass.getConstructor();
        Object obj = constructor.newInstance();

        //public Method[] getMethods()
        //Method[] getDeclaredMethods()
        Method[] methods = studentClass.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("-----------------------");
        Method[] methodss = studentClass.getDeclaredMethods();
        for(Method m : methodss){
            System.out.println(m);
        }
        System.out.println("-----------------------");

        //Method getMethod(String name, Class<?>... parameterTypes)
        //Method getDeclaredMethod(String name, Class<?>... parameterTypes)
        Method method = studentClass.getMethod("method");
        Method function = studentClass.getDeclaredMethod("function");
        System.out.println(method);
        System.out.println("-----------------------");
        System.out.println(function);
        System.out.println("-----------------------");

        //通过对象调用方法
//        obj.method();

        //Object invoke(Object obj, Object... args)
        //          对带有指定参数的指定对象调用由此 Method 对象表示的底层方法

        method.invoke(obj);

    }
}
