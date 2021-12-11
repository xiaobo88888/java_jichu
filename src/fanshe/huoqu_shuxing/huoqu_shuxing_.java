package fanshe.huoqu_shuxing;

import fanshe.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    public Field[] getFields() throws SecurityException
        返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段

    public Field[] getDeclaredFields() throws SecurityException
        返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段

    Field getField(String name)
          返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。

     Field getDeclaredField(String name)
          返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。

    public void set(Object obj,Object value) throws IllegalArgumentException,IllegalAccessException
        将指定对象变量上此 Field 对象表示的字段设置为指定的新值
 */
public class huoqu_shuxing_ {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;

        //public Field[] getFields()
        //public Field[] getDeclaredFields()
        Field[] studentFields = studentClass.getFields();
        for(Field field : studentFields){
            System.out.println(field);
        }

        Field[] studentFieldss = studentClass.getDeclaredFields();
        for(Field field : studentFieldss){
            System.out.println(field);
        }

        //Field getField(String name)
        //Field getDeclaredField(String name)
        Field studentaddress = studentClass.getField("address");
        System.out.println(studentaddress);
        Field studentage = studentClass.getDeclaredField("age");
        System.out.println(studentage);


        //获取无参构造方法创建对象
        Constructor<Student> studentConstructor = studentClass.getConstructor();
        Student student = studentConstructor.newInstance();

        //通过对象给属性赋值
//        student.studentaddress = "吉安";

        //public void set(Object obj,Object value)
        studentaddress.set(student, "吉安");//是将student的成员变量studentaddress赋值为"吉安"
        System.out.println(student);


    }
}
