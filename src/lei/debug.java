package lei;

import java.util.Scanner;

/*
* 断点调试
* 1.左键代码行左边可以增加断点
* 2.运行选择debug运行，然后点击F7或者上面的蓝色箭头可以从断点行开始往下运行
* 3.红色□结束断点运行
* 4.断点测试时，如果有输入的语句，需要现在控制台先输入*/
public class debug
{
    public static void main(String[] args)
    {
        int i;
        for (i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
        Scanner in = new Scanner(System.in);
        int a, b;
        int max;
        System.out.println("请输入以两个整数：");
        a = in.nextInt();
        b = in.nextInt();
        max = getMax(a, b);
        System.out.println("最大值为：" + max);
    }
    public static int getMax(int a, int b)
    {
        if(a < b)
            return b;
        else
            return a;
    }
}
