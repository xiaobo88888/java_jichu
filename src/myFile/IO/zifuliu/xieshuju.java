package myFile.IO.zifuliu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
        使用字符流写数据要刷新

        void write(int c);写一个字符
        void write(char[] cbuf);写入一个字符数组
        void write(char[] cbuf, int off, int len);写入字符数组的一部分
        void write(String str);写入一个字符串
        void write(String str, int off, int len);写入一个字符串的一部分

        void flush();刷新流，还可以继续写数据
        void close();关闭流，但是在关闭流之前会刷新一次流，关闭后不能再写入数据
 */
public class xieshuju {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\java_File\\osw.txt"));

        // void write(int c);写一个字符
       osw.write(97);//用字符流写数据的时候，是不能直接写到文件里面来的，所以这个c还在缓冲区
        //void flush();刷新流
//       osw.flush();
       osw.write(98);
//       osw.flush();
       osw.write(99);

        //void write(char[] cbuf);写入一个字符数组
//        char[] ch = {'l', 'i', 'u', 'b', 'o'};
//        osw.write(ch);

        // void write(char[] cbuf, int off, int len);写入字符数组的一部分
//        char[] ch = {'l', 'i', 'u', 'b', 'o'};
//        osw.write(ch, 0, ch.length - 1);

        //void write(String str);写入一个字符串
//        osw.write("刘博");

        //void write(String str, int off, int len);写入一个字符串的一部分
//        osw.write("liubo", 0, "liubo".length() - 1);

       osw.close();//先刷新，再关闭，为了防止忘记刷新缓冲区
    }
}
