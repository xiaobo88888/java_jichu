package jihe.TreeSet;

/*
* compareTo()：
*            比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。
* */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
//        return 0;
        //按照年龄从小到大排序
        int num = this.age - o.age;//如果后一个对象的年龄比前一个对象的年龄大，则返回正整数，其余同理
        //年龄相同时按照名字首字母排序
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        return num2;
    }
}
