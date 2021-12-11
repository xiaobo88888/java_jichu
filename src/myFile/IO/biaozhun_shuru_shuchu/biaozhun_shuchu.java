package myFile.IO.biaozhun_shuru_shuchu;

import java.io.PrintStream;

public class biaozhun_shuchu {
    public static void main(String[] args) {
        //pubic static final PrintStream out : 标准输出流。
        //      通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
        PrintStream ps = System.out;

//        ps.print("刘博");
//        ps.print(100);

        ps.println("刘博");
        ps.println(100);

        //System.out.println(); 本质是一个字节输出流
        //PrintStream类中有的方法，System.out都可以用
        System.out.println("刘博");
        System.out.println(100);
    }
}
