package jihe.myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*集合的使用步骤：
*   1.创建集合对象
*   2.添加元素
*      2.1 创建元素
*      2.2 添加元素到集合
*   3.遍历集合
*      3.1 通过集合对象获取迭代器对象
*      3.2 通过hasNext()方法判断集合是否有元素
*      3.3 通过next()方法获取集合元素
* */

public class Collection_Student {
    public static void main(String[] args) {
        //1.创建集合对象
        Collection<Student> c = new ArrayList<Student>();

        //2.添加元素
        Student s1 = new Student("刘博", 19);
        Student s2 = new Student("煤球", 20);
        Student s3 = new Student("高辉", 19);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        // 3.遍历集合
        Iterator<Student> i = c.iterator();

        while(i.hasNext()){
            Student student = i.next();
            System.out.println(student.getName() + ":" + student.getAge());
        }
    }
}
