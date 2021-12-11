package jihe;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set_Random {
    public static void main(String[] args) {
        //创建Set集合对象，采用Set集合，元素不重复
//        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> s = new TreeSet<Integer>();//如果采用TreeSet集合，则元素有序

        //创建Random对象
        Random r = new Random();

        //循环插入集合中，判断集合长度
        while (s.size() <= 10){
            //产生随机数
            int i = r.nextInt(20) + 1;
            s.add(i);
        }

        //遍历集合
        for (Integer i : s){
            System.out.println(i);
        }
    }
}
