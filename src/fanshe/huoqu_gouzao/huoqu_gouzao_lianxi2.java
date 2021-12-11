package fanshe.huoqu_gouzao;

import fanshe.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class huoqu_gouzao_lianxi2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //创建类的对象
        Class<Student> studentClass = Student.class;

        //得到构造方法对象
        // private Student(String name)
        Constructor<Student> studentConstructor = studentClass.getDeclaredConstructor(String.class);

        //暴力反射，正常来说，即使你得到了类的私有的构造方法，你也不能使用它来创建对象
        //public void setAccessible(boolean flag); 参数值为true，取消访问权限检查，参数值为false，执行访问权限检查
        studentConstructor.setAccessible(true);

        //创建对象
        Student student = studentConstructor.newInstance("刘博");

        //输出对象
        System.out.println(student);

    }
}
