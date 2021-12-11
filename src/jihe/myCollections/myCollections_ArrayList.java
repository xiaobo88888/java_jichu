package jihe.myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*  需求：
*       使用ArrayList集合存储学生对象，使用Collections对集合进行排序
*       要求年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
*
*       升序排序使用public static <T> void sort(List<T> list,Comparator<? super T> c)
*   */
public class myCollections_ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("liubo", 19);
        Student s2 = new Student("meiqiu", 20);
        Student s3 = new Student("longge", 22);
        Student s4 = new Student("gaohui", 19);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //使用Collections对集合进行排序
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//                return 0;
                //要求年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //遍历集合
        for (Student s : array){
            System.out.println(s.getAge() + ":" + s.getName());
        }
    }
}
