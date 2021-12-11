package ArrayList_Test;

import java.util.ArrayList;
import java.util.Scanner;

/*System.exit(0)退出虚拟机
* 类似于C语言的exit(0)*/
public class StudentManger {
    public static void main(String[] args){
        ArrayList<Students> array = new ArrayList<Students>();
        while(true) {
            System.out.println("————————————欢迎来到学生管理系统——————————————");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");

            System.out.println("请输入你的选择：");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();

            switch (line) {
                case "1":
//                    System.out.println("1.添加学生");
                    addstudent(array);
                    break;
                case "2":
//                    System.out.println("2.删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("3.修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("4.查看所有学生");
                    findallstudent(array);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    System.exit(0);
            }
        }
    }
    public static void addstudent(ArrayList<Students> array){
        Scanner in = new Scanner(System.in);

        String id;
        while(true) {
            System.out.println("请输入学生学号：");
            id = in.nextLine();
            if (isUsed(array, id)) {
                break;
            }else{
                System.out.println("学号重复，请重新输入");
            }
        }
        System.out.println("请输入学生姓名：");
        String name = in.nextLine();
        System.out.println("请输入学生年龄：");
        String age = in.nextLine();
        System.out.println("请输入学生居住地：");
        String address = in.nextLine();


        Students student = new Students();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        array.add(student);

        System.out.println("添加学生成功！");
    }
    public static void findallstudent(ArrayList<Students> array){
        if(array.size() == 0){
            System.out.println("无信息，请先输入再查询");
            return;//没有返回值的return，结束该方法
        }
        System.out.println("id\t姓名\t年龄\t居住地");

        for (int i = 0; i < array.size(); i++){
            Students s = array.get(i);
            System.out.println(s.getId() + '\t' + s.getName() + '\t'
            + s.getAge() + '\t' + s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Students> array){
        System.out.println("请输入你先要删除学生的学号：");
        Scanner in = new Scanner(System.in);
        String id = in.nextLine();

        for (int i = 0; i < array.size(); i++){
            Students s = array.get(i);
            if(s.getId().equals(id)){
                array.remove(i);
                System.out.println("删除成功");
                break;
            }
            if(i + 1 == array.size()){
                System.out.println("未找到该学生，请重新输入");
            }
        }
    }
    public static void updateStudent(ArrayList<Students> array){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你先要修改的学生学号：");
        String id = in.nextLine();

        for (int i = 0; i < array.size(); i++){
            Students s = array.get(i);
            if(s.getId().equals(id)){
                System.out.println("请输入新姓名");
                String name = in.nextLine();
                System.out.println("请输入新年龄：");
                String age = in.nextLine();
                System.out.println("请输入新居住地：");
                String address = in.nextLine();

                Students s2 = new Students();
                s2.setId(id);
                s2.setName(name);
                s2.setAge(age);
                s2.setAddress(address);

                array.set(i, s2);
                System.out.println("修改成功");
                break;
            }
            if(i + 1 == array.size()){
                System.out.println("未找到该学生，请重新输入");
            }
        }

    }
    public static boolean isUsed(ArrayList<Students> array, String id){
        for (int i = 0; i < array.size(); i++){
            Students s = array.get(i);
            if(s.getId().equals(id)){
                return false;
            }
        }
        return true;
    }
}
