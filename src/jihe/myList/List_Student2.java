package jihe.myList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Student2 {
    public static void main(String[] args) {
        //创建学生类对象
        List<Student> list = new ArrayList<Student>();

        //添加元素
        Student s1 = new Student("刘博", 19);
        Student s2 = new Student("煤球", 20);
        Student s3 = new Student("高辉", 19);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器遍历
        ListIterator<Student> lit = list.listIterator();
        while(lit.hasNext()){
            Student ss = lit.next();
            System.out.println(ss.getAge() + ":" + ss.getName());
        }

        //循环遍历 带索引的遍历
        for (int i = 0; i < list.size(); i++){
            Student ss2 = list.get(i);
            System.out.println(ss2.getAge() + ":" + ss2.getName());
        }

        //for-each循环遍历  最方便的遍历
        for (Student ss3 : list){
            System.out.println(ss3.getAge() + ":" + ss3.getName());
        }
    }
}
