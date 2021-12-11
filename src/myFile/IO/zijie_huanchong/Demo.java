package myFile.IO.zijie_huanchong;

import java.io.*;

/*
    字节缓冲流：
        BufferedOutputStream:该类实现缓冲的输出流。通过设置这种输出流，应用程序就可以将各个字节写入底层
            输出流中，而不必针对每次字节写入调用底层系统。
        BufferedInputStream:创建BufferedInputStream将创建一个内部缓冲区数组，当从流中读取或跳过字节时，
            内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多个字节

    构造方法：
        字节缓冲输出流：public BufferedOutputStream(OutputStream out)
            创建一个新的缓冲输出流，以将数据写入指定的底层输出流
        字节缓冲输入流：public BufferedInputStream(InputStream in)
            创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用

    为什么构造方法要的是字节流，而不是具体的文件或路径：
        字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作


 */
public class Demo {
    public static void main(String[] args) throws IOException {
        /*
        //创建字节缓冲输出流对象
//        FileOutputStream fos = new FileOutputStream("src\\myFile\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\myFile\\bos.txt"));

        //写数据
        bos.write("hi".getBytes());
        bos.write("\r\nsb".getBytes());

        //释放资源
        bos.close();
         */

        //创建字节缓冲输入流对象
//        FileInputStream fis = new FileInputStream("src\\myFile\\bos.txt");
//        BufferedInputStream bos = new BufferedInputStream(fis);
        BufferedInputStream bos = new BufferedInputStream(new FileInputStream("src\\myFile\\bos.txt"));

        //读数据，一次读一个字节
//        int b;
//        while((b = bos.read()) != -1){
//            System.out.print((char)b);
//        }

        //读数据，一次读一个字节数组
        byte[] b = new byte[1024];
        int len;
        while((len = bos.read(b)) != -1){
            System.out.print(new String(b, 0, len));
        }

        //释放资源
        bos.close();
    }
}
