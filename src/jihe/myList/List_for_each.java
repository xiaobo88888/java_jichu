package jihe.myList;

import java.util.ArrayList;
import java.util.List;

/*增强for循环
*   增强for:简化数组和集合的遍历
*       实现Iterable接口的类允许其对象成为增强型for语句的目标
*       它是JDK5之后出现的，其内部原理是一个Iterator迭代器
*   格式：
*       for(元素数据类型 变量名:数组或Collection集合){//元素数据类型要和数组或Collection的类型一致
*           //在此处使用变量即可，该变量就是元素
*       }
* */
public class List_for_each {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        for(int i : num){
            System.out.println(i);
        }

        String[] string = {"hello", "world", "java"};
        for(String s : string){
            System.out.println(s);
        }

        List<String> list = new ArrayList<String>();
        list.add("liubo");
        list.add("dashuaige");
        list.add("zuishuai");
        for(String ss : list){
            System.out.println(ss);
        }

        //其内部原理是一个Iterator迭代器
//        for(String ss : list){
//            if(ss.equals("liubo"))//ConcurrentModificationExceptio
//                list.add("帅");
//        }
    }
}
