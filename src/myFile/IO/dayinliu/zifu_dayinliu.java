package myFile.IO.dayinliu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
    构造方法：
        PrintWriter(String fileName);
            创建具有指定文件名称且不带自动行刷新的新 PrintWriter。
        PrintWriter(Writer out, boolean autoFlush)
            创建新 PrintWriter。
            out - 字符输出流
            autoFlush - boolean 变量；如果为 true，则 println、printf 或 format 方法将刷新输出缓冲区
 */
public class zifu_dayinliu {
    public static void main(String[] args) throws IOException {
        //PrintWriter(String fileName);
        //    创建具有指定文件名称且不带自动行刷新的新 PrintWriter。
        /*PrintWriter pw = new PrintWriter("E:\\java_File\\字符打印.txt");

        pw.write("刘博");
        pw.write("\r\n");
        pw.flush();
        pw.write(100);
        pw.write("\r\n");
        pw.flush();

        pw.println("刘博");
        *//*
            pw.writer("刘博");
            pw.writer("\r\n");
         *//*
        pw.flush();
        pw.println(100);
        pw.flush();

        pw.close();*/

        //PrintWriter(Writer out, boolean autoFlush)
        PrintWriter ps = new PrintWriter(new FileWriter("E:\\java_File\\字符打印.txt"), true);

//        ps.write("煤球");
//        ps.write(97);
        ps.println("煤球");
        /*
            ps.writer("煤球");
            ps.writer("\r\n");
            ps.flush();
         */

        ps.close();
    }
}
