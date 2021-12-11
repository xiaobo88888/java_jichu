package myFile.IO.zijie_xieshuju;

import java.io.FileOutputStream;
import java.io.IOException;

/*  FileOutputStream：文件输出流用于将数据写入文件File
*       FileOutputStream(String name);创建文件输出流以指定名称写入文件
*
*   public void write(int b) throws IOException ：将指定字节写入此文件输出流
*   public void close() throws IOException : 关闭此文件输出流并释放与此流有关的所有系统资源
*
*   创建字节输出流写数据的步骤：
*       1.创建字节输出流对象(调用系统功能创建了文件, 创建了字节输出流对象, 让字节输出流对象指向创建好了的文件)
*       2.调用字节输出流对象的写数据方法
*       3.释放资源(关闭此文件输出流并释放与此流有关的所有系统资源)*/
public class xieshuju {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        // FileOutputStream(String name);创建文件输出流以指定名称写入文件
        FileOutputStream fos = new FileOutputStream("src\\myFile\\fos.txt");
        /*
            这里做了三件事：
                1：调用系统功能创建了文件
                2：创建了字节输出流对象
                3：让字节输出流对象指向创建好了的文件
         */
        //public void write(int b) throws IOException ：将指定字节写入此文件输出流
        fos.write(97);//用记事本打开的话是转化了的，会被转化为对应的字符

        //最后一定要释放资源
        //public void close() throws IOException : 关闭此文件输出流并释放与此流有关的所有系统资源
        fos.close();
    }
}
