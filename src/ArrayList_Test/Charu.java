package ArrayList_Test;

import java.util.ArrayList;
/*
* ArrayList——泛型数组列表
* ArrayList<E>，其中的E只能是引用类型，不能是基本类型
* add()方法，可以将元素插入数组末尾，返回值为boolean型
* add(位置，元素)方法，可以指定插入的位置，索引同样从0开始，注意插入的位置不能越界
* */
public class Charu {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();

        System.out.println(a);
        a.add("hello");
        System.out.println(a);
        a.add("javaee");
        System.out.println(a);

        a.add(1, "app");
        System.out.println(a);
//        a.add(4, "aaa");
        //这里越界了，只有三个元素，索引最大为2，却插在4位置
        a.add(3, "javase");
        System.out.println(a);
    }
}
