package myFile.IO.zifuliu_anli;

import java.io.*;

public class fuzhi_java {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr =  new InputStreamReader(new FileInputStream("src\\myFile\\IO\\myIO_fenlei.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\java_File\\复制java文件.java"));

        //一次读一个字符
//        int c;
//        while((c = isr.read()) != -1){
//            osw.write(c);
//        }

        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = isr.read(chs)) != -1){
            osw.write(chs, 0, len);
        }

        osw.close();
        isr.close();

    }
}
