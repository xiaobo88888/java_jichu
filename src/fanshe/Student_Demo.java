package fanshe;

import fanshe.Student;

/*
    三种方式获取Class对象
        1.使用类的class属性来获取该类对应的Class对象
        2.调用对象的getClass()方法，返回该对象所属类对应的Class对象
        3.使用Class类中的静态方法forName(String className);该方法需要传递字符串参数，该字符串参数的值是某个类的全路径，
          也就是完整的包名路径
 */
public class Student_Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.使用类的class属性来获取该类对应的Class对象
        Class<Student> c1 = Student.class;//最方便
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);//true
        System.out.println("----------------");

        //2.调用对象的getClass()方法，返回该对象所属类对应的Class对象
        Student student = new Student();
        Class<? extends Student> c3= student.getClass();
        System.out.println(c1 == c3);//true
        System.out.println("----------------");

        //3.使用Class类中的静态方法forName(String className);该方法需要传递字符串参数，该字符串参数的值是某个类的全路径，
        //          也就是完整的包名路径
        Class<?> c4 = Class.forName("fanshe.Student");//灵活性最高
        System.out.println(c1 == c4);//true
        System.out.println("----------------");

    }
}
