package jihe.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
*       TreeSet(Comparator comparator);根据指定的比较器进行排序
*       而Comparator<E>是个接口，所以这里需要一个接口的实现类对象
*           int compare(T o1,T o2)比较用来排序的两个参数。根据第一个参数小于、等于或
*           大于第二个参数分别返回负整数、零或正整数
*
*       用TreeSet集合存储自定义对象，带参构造方法使用的是比较器对元素进行排序
*       比较器排序，就是让TreeSet集合的构造方法接收Comparator<E>接口的实现类对象，重写int compare(T o1,T o2)方法、
*       重写方法时，注意按序规则必须按照排序的主要和次要要求来写
* */

/*自然排序和比较器排序，一个是在类中重写Comparable<E>接口的方法compareTo()方法
* 一个是在构造方法中传递Comparator<E>接口的实现类*/
public class treeSet_comparator_Student2 {
    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<Student2>(new Comparator<Student2>() {
            //匿名内部类来创建实现列对象
            @Override
            public int compare(Student2 s1, Student2 s2) {//然后重写compare方法
                  //自然排序用的是thsi.age - s.age
                  //而这里有两个Student2类的对象，s1就指代了this，s2指代了s
                int num = s1.getAge() - s2.getAge();//这里不能直接访问Student2类的私有属性，所以这里得调用方法
                //这里当年龄相同的时候，来比较姓名，这里通过getName()获得姓名，而String类重写了copareTo方法
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
//                return 0;
            }
        });

        Student2 s1 = new Student2("liubo", 19);
        Student2 s2 = new Student2("liuxin", 21);
        Student2 s3 = new Student2("meiqiu", 20);
        Student2 s4 = new Student2("yangjie", 20);//年龄相同则比较姓名
        Student2 s5 = new Student2("yangjie", 20);//两个年龄姓名都相同，则不会插入TreeSet集合中


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //ClassCastException
        for (Student2 s : ts){
            System.out.println(s.getName() + ":" + s.getAge());
        }
    }
}
