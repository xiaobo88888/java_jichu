package jihe.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class myMap_String_Student {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("刘博", 19);
        Student s2 = new Student("煤球", 20);
        Student s3 = new Student("高辉", 19);
        Student s4 = new Student("小红", 20);

        //添加HashMap集合对象
        map.put("帅哥", s1);
        map.put("汉子", s2);
        map.put("运动", s3);
        map.put("汉子", s4);
        //String类已经重写了equals和HashCode方法，所以直接可以比较字符串是否相同

        //遍历
        Set<String> set = map.keySet();
        for (String i : set){
            Student s = map.get(i);
            System.out.println(s.getName() + ":" + s.getAge());
        }

        //遍历二
        Set<Map.Entry<String, Student>> se = map.entrySet();
        for (Map.Entry<String, Student> me : se){
            String i = me.getKey();
            Student s = me.getValue();
            System.out.println(i + ":" + s.getName() + "," + s.getAge());
        }


    }
}
