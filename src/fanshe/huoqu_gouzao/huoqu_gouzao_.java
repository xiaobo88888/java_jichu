package fanshe.huoqu_gouzao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取构造方法并使用
 */
public class huoqu_gouzao_ {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("fanshe.Student");

        //public Constructor<?>[] getConstructors() throws SecurityException
        //  返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法
//        Constructor<?>[] cons = c.getConstructors();


        //public Constructor<?>[] getDeclaredConstructors() throws SecurityException
        //  返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for(Constructor con : cons){
            System.out.println(con);
        }

        System.out.println("------------");

        //public Constructor<T> getConstructor(Class<?>... parameterTypes) throws NoSuchMethodException,SecurityException
        //   返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法
        //public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)throws NoSuchMethodException,SecurityException
        //   返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法
        //参数：你要获取的构造方法的参数的个数和数据类型对应的字节码文件对象

        Constructor<?> con = c.getConstructor();//通过类的字节码文件对象c得到了类的无参构造函数的对象con

        // T newInstance(Object... initargs)
        //  使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
        Object obj = con.newInstance();
        System.out.println(obj);/* 和Student s = new Student();  System.out.println(s);得到的结果一致*/

    }
}
