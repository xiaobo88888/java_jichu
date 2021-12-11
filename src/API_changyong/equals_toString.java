package API_changyong;

/*
* toString  equals
* 这两个都是Object的方法，如果要使用最好在类中重写方法
*
* 选中类或者方法按下ctrl + B可以查看源代码*/
public class equals_toString {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
        student.setName("小der");

        Student student1 = new Student();
        student1.setAge(20);
        student1.setName("小der");

        System.out.println(student.equals(student1));

        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}
