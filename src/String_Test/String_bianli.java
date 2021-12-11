package String_Test;

import java.util.Scanner;

/*
* 字符串对象.length()——可以得到字符串的长度
* 注：字符数组得到长度是数组名.length，这里没有括号
* 字符串对象.charAt(i)——可以得到字符串对象在i处索引的值*/
public class String_bianli {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String s = in.nextLine();

        System.out.println(s.length());
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
