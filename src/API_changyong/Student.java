package API_changyong;

public class Student {
    private String name;
    private int age;

    public Student() {
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
    //重写Object类的equals方法，原来是比较地址的，现在重写为比较对象的内容
    public boolean equals(Object o) {
        //this --- student   o --- student1

        //这里判断student和student1的地址是否相等
        if (this == o) return true;
        //这里比较student1是否为空和student和student1是否为同一个创建的--->getClass()
        if (o == null || getClass() != o.getClass()) return false;

        //这里student1本来是Object类型的，但被强转为子类了
        Student student = (Student) o;

        //然后比较对象的内容是否相等
        if (age != student.age) return false;
        //这里先比较字符串类型的name是否是空值，然后比较两个字符串是否相等
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    //这里重写Object的toString方法，原本这是输出一堆特征性不强的字符串，现在重写为输出对象的属性了
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
