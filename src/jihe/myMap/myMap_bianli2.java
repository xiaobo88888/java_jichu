package jihe.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*      把Map集合看成夫妻对，根据结婚证得到夫妻二人
*       得到键值对，根据键值对得到键和值
*
*       获取键值对对象
*           Set<Map.Entry<K, V>> entrySet();  获取所有键值对对象的集合，得到键值对类型的Set集合，因为键唯一，所以键值对是唯一的
*           Set集合里面元素的类型是Map.Entry<K, V>
*       遍历键值对对象集合，得到每一个键值对对象
*           用增强for，得到每一个Map.Entry对象
*       根据键值对对象获取键和值
*           getKey() 得到键
*           getValue()  得到值
*        */
public class myMap_bianli2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>();

        map.put("小小", "大大");
        map.put("多多", "少少");
        map.put("重重", "轻轻");

        //获取键值对对象  Set<Map.Entry<K, V>> entrySet();
        Set<Map.Entry<String, String>> set = map.entrySet();

        //遍历键值对对象集合，得到每一个键值对对象
        for (Map.Entry<String, String> me : set){
            //根据键值对对象获取键和值  getKey() 得到键  getValue()  得到值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + ":" + value);
        }

    }
}
