package hanshushi_interface.changyong;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_Test {
    public static void main(String[] args) {
        String[] str = {"刘博,19", "煤球,20", "高辉,19"};

        //姓名要>=2，年龄要>19
        ArrayList<String> arr = check(str, s -> s.split(",")[0].length() >= 2,
                s -> Integer.parseInt(s.split(",")[1]) > 19);

        System.out.println(arr);
    }

    private static ArrayList<String> check(String[] str, Predicate<String> p1, Predicate<String> p2){
        //定义一个集合
        ArrayList<String> arr = new ArrayList<String>();

        //遍历字符串数组
       for(String s : str){
           //对字符串操作返回逻辑与
           if(p1.and(p2).test(s))
               arr.add(s);
       }

       return arr;
    }
}
