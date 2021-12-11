package myFile.IO.duixiang_xuliehua;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 42L;

    private String name;
//    private int age;
    private transient int age;//transient 修饰，表示该成员变量不参与序列化

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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
