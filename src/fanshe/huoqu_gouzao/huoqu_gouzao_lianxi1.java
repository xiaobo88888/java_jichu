package fanshe.huoqu_gouzao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class huoqu_gouzao_lianxi1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //先获取类的字节码文件
        Class<?> studentClass = Class.forName("fanshe.Student");

        //得到构造方法的对象
        //public Student(String name, int age, String address)
        //public Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<?> studentConstructor = studentClass.getConstructor(String.class, int.class, String.class);
        //基本数据类型也可以通过.class得到对应的Class类型

        //创建对象
        //T newInstance(Object... initargs)
        Object obj = studentConstructor.newInstance("刘博", 19, "吉安");

        //输出对象
        System.out.println(obj);
    }
}
