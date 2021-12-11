package myFile.IO.dayinliu;

import java.io.IOException;
import java.io.PrintStream;

/*
    PrintStream(String fileName) : 使用指定的文件名创建新的打印流
 */
public class zijie_dayinliu {
    public static void main(String[] args)throws IOException {
        PrintStream ps = new PrintStream("E:\\java_File\\字节打印.txt");

        //使用字节打印流的方法
        ps.write(97);//使用继承父类的方法写数据，查看的时候会转码

        //使用特有的方法
            //如果使用自己特有的方法写数据时，查看的数据会原样输出
        ps.print(97);
        ps.print(98);

        ps.println(97);
        ps.println(98);

        ps.close();
    }
}
