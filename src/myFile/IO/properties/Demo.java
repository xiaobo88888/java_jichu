package myFile.IO.properties;

import java.util.Properties;
import java.util.Set;

/*
    Properties 概述：
        是一个Map体系的集合类
        properties可以保存到流中或从流中加载
 */
public class Demo {
    public static void main(String[] args) {
        //创建集合对象
        //public class Properties extends Hashtable<Object,Object>
        //后面没跟泛型
//        Properties<String, String> prop = new Properties<String, String>();  错误写法

        Properties prop = new Properties();

        prop.put("刘博", 19);
        prop.put("煤球", 20);
        prop.put("高辉", 19);

        //没有指定类型，所以键和值都是Object类型
        Set<Object> keyset = prop.keySet();
        for(Object key : keyset){
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

    }
}
