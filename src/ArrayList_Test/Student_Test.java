package ArrayList_Test;

import java.util.ArrayList;

public class Student_Test {
    public static void main(String[] args){
        ArrayList<Student> stu = new ArrayList<Student>();
        //创建类类型的数组列表

        Student s1 = new Student("刘博", 19);
        Student s2 = new Student("煤球", 20);
        Student s3 = new Student("高辉", 19);
        //创建类类型

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        //增加数组元素

        for (int i = 0; i < stu.size(); i++){
//            System.out.println(stu.get(i).getName() + ":" + stu.get(i).getAge());

            Student s = stu.get(i);//最好是取出元素给一个变量，因为可能需要修改元素
            System.out.println(s.getName() + ":" + s.getAge());
        }
        //输出数组元素
    }
}
