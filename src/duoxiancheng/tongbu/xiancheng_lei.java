package duoxiancheng.tongbu;

import java.util.*;

/*
    线程安全的类        不考虑线程安全，可采用如下类替代
    StringBuffer   ——    StringBuilder
    Vector         ——    ArrayList
    Hashtable      ——    HashMap


    线程安全的类里面的方法都是同步方法
 */
public class xiancheng_lei {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<String>();
        ArrayList<String> arr = new ArrayList<>();

        Hashtable<String,String> ht = new Hashtable<String, String>();
        HashMap<String, String> hm = new HashMap<String, String>();

        //一般使用StringBuffer的会比较多，但是使用Vector和Hashtable的就比较少了

        //Collections类中有两个方法

        //public static <T> List<T> synchronizedList(List<T> list)返回指定列表支持的同步（线程安全的）列表
        List<String> cs = Collections.synchronizedList(new ArrayList<String>());
        //synchronizedList方法中调用了SynchronizedList<E>这个类，而这个类中的方法都采用了同步代码块的方式实现线程同步

        //public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)返回由指定映射支持的同步（线程安全的）映射
        Map<String, String> cs2 = Collections.synchronizedMap(new HashMap<String, String>());
        //synchronizedMap方法调用了SynchronizedMap<K,V>这个类，而这个类中的方法都采用了同步代码块的方式实现线程同步

        //public static <T> Set<T> synchronizedSet(Set<T> s)返回指定 set 支持的同步（线程安全的）set
        Set<String> cs3 = Collections.synchronizedSet(new HashSet<String>());
        //synchronizedSet方法调用了SynchronizedCollection<E>这个类，而这个类中的方法都采用了同步代码块的方式实现线程同步


    }
}
