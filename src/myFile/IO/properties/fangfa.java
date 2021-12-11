package myFile.IO.properties;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为集合的特有方法：
           1. public Object setProperty(String key,String value)
                调用 Hashtable 的方法 put
           2.public String getProperty(String key)
                用指定的键在此属性列表中搜索属性
           3.public Set<String> stringPropertyNames()
                返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，
                则还包括默认属性列表中不同的键。其键或值不是 String 类型的属性被忽略
 */
public class fangfa {
    public static void main(String[] args) {
        Properties pro = new Properties();

        //1. public Object setProperty(String key,String value)
        //       调用 Hashtable 的方法 put
        pro.setProperty("刘博", "男");
        /*
            public synchronized Object setProperty(String key, String value) {
                return put(key, value);
            }
            public synchronized Object put(Object key, Object value) {
                return map.put(key, value);
            }
         */
        pro.setProperty("煤球", "女");
        pro.setProperty("高辉", "女");

        //2.public String getProperty(String key)
        //       用指定的键在此属性列表中搜索属性
        System.out.println(pro.getProperty("刘博"));
        System.out.println(pro.getProperty("bb"));//null

        //3.public Set<String> stringPropertyNames()
        //                返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，
        //                则还包括默认属性列表中不同的键。其键或值不是 String 类型的属性被忽略
        Set<String> strings = pro.stringPropertyNames();
        for (String key : strings){
//            System.out.println(key);
            String value = pro.getProperty(key);
            System.out.println(key + "," + value);
        }

        System.out.println(pro);
    }
}
