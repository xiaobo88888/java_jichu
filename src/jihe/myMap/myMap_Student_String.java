package jihe.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class myMap_Student_String {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<Student, String>();

        //创建学生对象
        Student s1 = new Student("刘博", 19);
        Student s2 = new Student("煤球", 20);
        Student s3 = new Student("高辉", 19);
        Student s4 = new Student("高辉", 19);

        //添加进集合中
        map.put(s1, "帅哥");
        map.put(s2, "汉子");
        map.put(s3, "运动");
        map.put(s4, "受伤");
        //如果没有在Student类中重写HashCode和equals方法，那么键值会不同
        //如果重写了，那么会比较键的属性相同，那么就不会存储

        //遍历
        Set<Student> stu = map.keySet();
        for (Student s : stu){
            String i = map.get(s);
            System.out.println(s.getName() + "," + s.getAge() + ":" + i);
        }

    }
}
