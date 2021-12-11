package fanshe.huoqu_shuxing;

import fanshe.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class huoqu_shuxing_lianxi1 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //先创建类的Class对象
        Class<Student> studentClass = Student.class;

        //得到类的对象
        Constructor<Student> constructor = studentClass.getConstructor();
        Student student = constructor.newInstance();
        System.out.println(student);//Student{names = 'null', age = 0, address = 'null'}

        //然后得到成员变量的Field对象
        Field address = studentClass.getField("address");
        Field age = studentClass.getDeclaredField("age");
        Field name = studentClass.getDeclaredField("name");

        //这里也要暴力反射
        address.setAccessible(true);
        age.setAccessible(true);
        name.setAccessible(true);

        //给成员变量赋值
        address.set(student, "吉安");
        age.set(student, 19);
        name.set(student, "刘博");

        //输出对象
        System.out.println(student);//Student{names = '刘博', age = 19, address = '吉安'}
    }
}
