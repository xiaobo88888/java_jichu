package jihe.myMap;

import java.util.*;

/*
*   Map集合的获取功能
*       V get(Object key);  根据键获取值
*       Set<K> keySet();  获取所有键的集合(因为键是唯一的，所以用Set集合)
*       Collection <V> values();  获取所有值的集合(值不一定是唯一的，所以用Collection)
*       (在遍历二中)Set<Map.Entry<K, V>> entrySet();  获取所有键值对对象的集合
* */
public class myMap_jihehuoqu {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();

        map.put("小小", "大大");
        map.put("多多", "少少");
        map.put("重重", "轻轻");

        //V get(Object key);  根据键获取值
        System.out.println(map.get("小小"));
        System.out.println(map.get("拉拉"));//没有该键所对应的值，返回null

        //Set<K> keySet();  获取所有键的集合(因为键是唯一的，所以用Set集合)
        Set<String> key = map.keySet();
        for (String i : key){//返回的是Set集合，所以可以用for-each循环遍历
            System.out.println(i);
        }

        //Collection <V> values();  获取所有值的集合(值不一定是唯一的，所以用Collection)
        Collection<String> values = map.values();
        Iterator<String> it = values.iterator();
        while(it.hasNext()){
            String i = it.next();
            System.out.println(i);
        }


    }
}
