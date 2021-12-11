package jihe.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        因为存储的键值对都是一对一对的，所以可以看成夫妻对，根据丈夫找出妻子
        根据键得到值
*       Map集合遍历一
*           1.获取所有键的集合  keySet()
*           2.遍历Set集合中的每一个键
*           3.根据get(Object key)方法获取键的值
* */
public class myMap_bianli1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("小小", "大大");
        map.put("多多", "少少");
        map.put("重重", "轻轻");

        //1.获取所有键的集合  keySet()
        Set<String> key = map.keySet();

        // 2.遍历Set集合中的每一个键
        for (String i : key){
            // 3.根据get(Object key)方法获取键的值
//            System.out.println(map.get(i));
            String value = map.get(i);
            System.out.println(i + "," + value);
        }

    }
}
