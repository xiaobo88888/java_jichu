package ArrayList_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Test2 {
    public static void main(String[] args){
        ArrayList<Student2> a = new ArrayList<Student2>();

        for (int i = 0; i < 3; i++){
            shuru(a);
        }
        for(int i = 0; i < a.size(); i++){
            Student2 s = a.get(i);
            System.out.println(s.getName() + ":" + s.getAge());
        }

    }
    //调用方法创建学生对象并插入数组列表
    public static void shuru(ArrayList<Student2> a){
        //这里不需要返回值，因为数组列表是一个引用
        Scanner in = new Scanner(System.in);

        String name;
        String age;
        System.out.println("请输入学生姓名：");
        name = in.nextLine();
        System.out.println("请输入学生年龄:");
        age = in.nextLine();

        Student2 s = new Student2();
        s.setName(name);
        s.setAge(age);

        a.add(s);
    }
}
