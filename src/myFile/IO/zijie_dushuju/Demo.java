package myFile.IO.zijie_dushuju;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    需求：把文件中的内容读取出来在控制台上输出

    FileInputStream:从文件系统中的文件获取输入字节
        public FileInputStream(String name) throws FileNotFoundException
            通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
            创建一个新 FileDescriptor 对象来表示此文件连接

    创建字节输入流读数据的步骤：
*       1.创建字节输入流对象(调用系统功能创建了文件, 创建了字节输入流对象, 让字节输入流对象指向创建好了的文件)
*       2.调用字节输入流对象的读数据方法
*       3.释放资源(关闭此文件输出流并释放与此流有关的所有系统资源)

    public int read() throws IOException 从此输入流中读取一个数据字节
        下一个数据字节；如果已到达文件末尾，则返回 -1
        换行也是会被读取的
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\myFile\\fos.txt");

//        int r = fis.read();
//        System.out.println(r);
//        System.out.println((char)r);
//
//        int r2 = fis.read();
//        System.out.println(r2);
//        System.out.println((char)r2);

        //循环读取
//        int b = fis.read();
//
//        while(b != -1){
//            System.out.println(b);
//            System.out.println((char)b);
//            b = fis.read();
//        }

        //优化循环读取
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }


        fis.close();
    }
}
