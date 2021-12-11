package myFile.IO.zijie_dushuju;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    将一个文件复制到另一个文件中去

    1.先创建字节输出流和输入流的对象
    2.每读取一个字节就将其写入另一个文件中
    3.释放输入流和输出流的资源
 */

public class dushuju_fuzhiwenben {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\myFile\\fos.txt");

        FileOutputStream fos = new FileOutputStream("E:\\java_File\\复制文本.txt");

        int b;
        while((b = fis.read()) != -1){//一次读取一个字节，一次写入一个字节
            fos.write(b);
        }

        fos.close();
        fis.close();
    }
}
