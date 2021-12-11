package myFile.IO.zijie_xieshuju;

import java.io.FileOutputStream;
import java.io.IOException;

/*
        构造方法：
             FileOutputStream(String name);创建文件输出流以指定名称写入文件

             public FileOutputStream(File file) throws FileNotFoundException
                创建一个向指定 File 对象表示的文件中写入数据的文件输出流

             这两个构造方法都做了一样的事，只是第一个更简洁一点

        写数据的三种方式：
            1.public void write(int b) throws IOException将指定字节写入此文件输出流

            2.public void write(byte[] b) throws IOException
                将 b.length 个字节从指定 byte 数组写入此文件输出流中

                String类中有一个方法可以将字符串转换成对应的字节数组
                    public byte[] getBytes()使用平台的默认字符集将此 String 编码为 byte 序列，
                    并将结果存储到一个新的 byte 数组中

            3.public void write(byte[] b,int off,int len)throws IOException
                将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
 */
public class xieshuju_fangfa {
    public static void main(String[] args) throws IOException {
        //FileOutputStream(String name);创建文件输出流以指定名称写入文件
        FileOutputStream fos = new FileOutputStream("src\\myFile\\fos.txt");
        //底层原理
//        FileOutputStream fos = new FileOutputStream(new File("src\\myFile\\fos.txt"));

        //public FileOutputStream(File file) throws FileNotFoundException
        //    创建一个向指定 File 对象表示的文件中写入数据的文件输出流
//        File file = new File("src\\myFile\\fos2.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
//        FileOutputStream fos2 = new FileOutputStream(new File("src\\myFile\\fos2.txt"));

        //1.public void write(int b) throws IOException将指定字节写入此文件输出流
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);

        //2.public void write(byte[] b) throws IOException
        //    将 b.length 个字节从指定 byte 数组写入此文件输出流中
//        byte[] bye = {101, 102, 103, 104};
        byte[] bye = "abcdefghi".getBytes();
//        fos.write(bye);

        //3.public void write(byte[] b,int off,int len)throws IOException
        //    将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
        fos.write(bye, 0, bye.length - 1);

        fos.close();


    }
}
