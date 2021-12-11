package jihe.fanxing;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
*       Arrays工具类中有一个静态方法：
*               public static <T> list <T> asList(T... a) : 返回由指定数组支持的固定大小的列表
*               返回的集合不能做增删操作，但可以做修改操作
*
*       List接口中有一个静态方法：
*               public static <E> List <E> of(E... elements) : 返回包含任意数量元素的不可变列表
*               可以给重复的元素
*               返回的集合不能做增删改操作
*
*       Set接口中有一个静态方法：
*               public static <E> Set <E> of(E... elements) : 返回一个包含任意数量元素的不可变集合
*               给的元素不能重复
*               不能做增删操作，没有修改方法
*
*
*       UnsupportedOperationExceptio : 不支持请求的操作
*       IllegalArgumentException : 表示一种方法已经通过了非法或者不正确的参数
*       */
public class fanxing_kebiancanshu_fangfa {
    public static void main(String[] args) {
        //public static <T> list <T> asList(T... a) : 返回由指定数组支持的固定大小的列表
        List<String> l = Arrays.asList("hello", "world", "java");

//        l.add("javaee"); //UnsupportedOperationExceptio
//        l.remove("java"); //UnsupportedOperationException
        //由于asList返回的是固定大小的列表，所以不能使用add和remove方法，因为会改变集合大小

        l.set(1, "school");

        System.out.println(l);


        //public static <E> List <E> of(E... elements) : 返回包含任意数量元素的不可变列表
        List<String> list = List.of("hello", "world", "java", "hello");//元素可重复

//        list.add("javaee");//UnsupportedOperationExceptio
//        list.remove("java");//UnsupportedOperationExceptio
//        list.set(0, "hi");//UnsupportedOperationExceptio
        //List.of 得到的集合，增删改查都不可以

        System.out.println(list);


        // public static <E> Set <E> of(E... elements) : 返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("hello", "world", "java", "java"); //IllegalArgumentException
        Set<String> set = Set.of("hello", "world", "java");

//        set.add("javaee"); //UnsupportedOperationExceptio
//        set.remove("java"); //UnsupportedOperationExceptio
        //Set集合没有set方法

        System.out.println(set);
    }
}
