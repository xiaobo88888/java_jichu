package jihe.mySet_HashSet;

import java.util.HashSet;

/*需要在类中重写两个方法才能保证元素的唯一性
        hashCode()和equals()方法
        自动生成即可*/
public class Set_hashSet_Student {
    public static void main(String[] args) {
        //创建hashSet集合对象
        HashSet<Student2> hs = new HashSet<Student2>();
        //创建学生对象
        Student2 s1 = new Student2("刘博", 19);
        Student2 s2 = new Student2("煤球", 20);
        Student2 s3 = new Student2("高辉", 19);
            //再添加一个一样的对象
        Student2 s4 = new Student2("刘博", 19);
        //添加学生对象
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);//发现会打印出来，所以要在Student2类中重写hashCode()和equals()方法
        //遍历
        for(Student2 s : hs){
            System.out.println(s.getAge() + ":" + s.getName());
        }
    }
}
