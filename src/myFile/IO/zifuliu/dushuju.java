package myFile.IO.zifuliu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
        使用字符流读数据和字节流读数据格式一样，只是一个读的是字符，一个读的是字节

        void read(int c);一次读一个字符
        void read(char[] cbuf);一次读一个字符数组数据
 */
public class dushuju {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\java_File\\osw.txt"));

        //一次读一个数据
//        int ch;
//        while((ch = isr.read()) != -1){
//            System.out.print((char)ch);
//        }

        //一次读一个字符数组的数据
        char[] chs = new char[1024];
        int len;
        while((len = isr.read(chs)) != -1){
            System.out.print(new String(chs, 0, len));
        }

        isr.close();
    }
}
