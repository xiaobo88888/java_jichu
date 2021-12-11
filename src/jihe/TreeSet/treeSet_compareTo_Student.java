package jihe.TreeSet;

import java.util.TreeSet;

/*Comparable<E>:此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo
             方法被称为它的自然比较方法————所以需要在类中实现该接口
  String 类实现了Comparable<E>接口，重写了compareTo()方法，它比较String类对象的每个字符与参数字符串的每个
         字符，如果在字母表中大于则返回正整数，小于则返回负整数

  用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
        自然排序就是让元素所属的类实现Comparable<E>接口，重写compareTo()方法
        重写方法时，注意按序规则必须按照排序的主要和次要要求来写
*/
public class treeSet_compareTo_Student {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("liubo", 19);
        Student s2 = new Student("liuxin", 21);
        Student s3 = new Student("meiqiu", 20);
        Student s4 = new Student("yangjie", 20);//年龄相同则比较姓名
        Student s5 = new Student("yangjie", 20);//两个年龄姓名都相同，则不会插入TreeSet集合中


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //ClassCastException
        for (Student s : ts){
            System.out.println(s.getName() + ":" + s.getAge());
        }
    }
}
