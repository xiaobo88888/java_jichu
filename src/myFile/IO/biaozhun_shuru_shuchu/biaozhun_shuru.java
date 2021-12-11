package myFile.IO.biaozhun_shuru_shuchu;

import java.io.*;
import java.util.Scanner;

/*
    System类中有两个静态成员变量：
            public static final InputStream in : 标准输入流。
                通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
            pubic static final PrintStream out : 标准输出流。
                通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
 */
public class biaozhun_shuru {
    public static void main(String[] args) throws IOException {
        //public static final InputStream in : 标准输入流。
        //      通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
//        InputStream is = System.in;

        //一次读取一个字节
//        int ch;
//        while((ch = is.read()) != -1) {
//            System.out.println((char)ch);
//        }

        //如何把字节流转化为字符流？  用转换流
        //InputStreamReader(InputStream in)
        //     创建一个使用默认字符集的 InputStreamReader。
//        InputStreamReader isr = new InputStreamReader(is);

        //能否读取一行数据？  可以
        //但是读取一行数据是字符缓冲流的特有功能
//        BufferedReader br = new BufferedReader(isr);

        /*InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/
        //可以将上面散步转换成一步

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一行数据：");
        String s = br.readLine();
        System.out.println("你输入的数据为：" + s);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());//想要得到什么类型的，就得用对应的类型包装类来转换
        System.out.println("你输入的整数是：" + i);

        //java提供的类来实现的
        Scanner in = new Scanner(System.in);

    }
}
