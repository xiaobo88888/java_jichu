package jihe.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Student {
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

        //遍历
        //迭代器遍历
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getAge() + ":" + s.getName());
        }
        //for循环遍历
        for(int i = 0; i < list.size(); i++){
            Student ss = list.get(i);
            System.out.println(ss.getAge() + ":" + ss.getName());
        }
    }
}
