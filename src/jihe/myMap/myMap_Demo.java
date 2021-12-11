package jihe.myMap;

import java.util.HashMap;
import java.util.Map;

/*
* Map集合概述
*   Interface Map<K,V>  k:键的类型  V:值的类型
*   将键映射到值的对象  不能包含重复的键   每个键最多可以映射到一个值
*
* 创建Map集合对象
*   采用多态的方式
*   具体实现类HashMap
*
* V put(K key, V value) 将指定的键和该映射中指定的值相关联*/
public class myMap_Demo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        //HashMap，对迭代顺序不做任何保证，且哈希表保证键的唯一性

        //V put(K key, V value) 将指定的键和该映射中指定的值相关联
        map.put("19", "刘博");
        map.put("20", "煤球");
        map.put("22", "龙哥");
        map.put("46", "老妈");
        map.put("19", "高辉");//如果键一样，那么这个值会把之前键对的值替换掉
        //当键值第一次出现是添加元素，第二次出现就是修改元素了

        //输出集合对象
        System.out.println(map);//{19=刘博, 20=煤球}  说明这里重写了toString()方法
    }
}
