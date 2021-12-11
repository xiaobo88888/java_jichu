package jihe.myMap;

import java.util.HashMap;
import java.util.Map;

/*
*   Map集合的基本功能
*           V put(K key, V value);  添加元素
*           V remove(Object key); 根据键删除键值对元素
*           void clear();  移除所有键值对元素
*           boolean containsKey(Object key);  判断集合是否包含指定的键
*           boolean containsValue(Object value);  判断集合是否包含指定的值
*           boolean isEmpty();  判断集合是否为空
*           int size();  返回集合长度，也就是集合中键值对的个数
* */
public class myMap_fangfa {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //V put(K key, V value);  添加元素
        map.put("小小", "大大");
        map.put("多多", "少少");
        map.put("重重", "轻轻");

        // V remove(Object key); 根据键删除键值对元素
//        System.out.println(map.remove("多多"));
//        System.out.println(map.remove("钱钱"));//没有该键，返回null

        //void clear();  移除所有键值对元素
//        map.clear();

        // boolean containsKey(Object key);  判断集合是否包含指定的键
//        System.out.println(map.containsKey("小小"));
//        System.out.println(map.containsKey("钱钱"));

        //boolean containsValue(Object value);  判断集合是否包含指定的值
//        System.out.println(map.containsValue("大大"));
//        System.out.println(map.containsValue("吼吼"));

        //boolean isEmpty();  判断集合是否为空
//        System.out.println(map.isEmpty());

        //int size();  返回集合长度，也就是集合中键值对的个数
        System.out.println(map.size());

        System.out.println(map);
    }
}
