package myFile.IO.zijie_dushuju;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    public int read() throws IOException
        从此输入流中读取一个数据字节
        返回下一个数据字节，如果到达文件末尾，则返回-1

   public int read(byte[] b) throws IOException
        从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
        返回读入缓冲区的字节总数

        public String(byte[] bytes,int offset,int length)
            通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String

    public int read(byte[] b,int off,int len) throws IOException
        从此输入流中将最多 len 个字节的数据读入一个 byte 数组中
 */
public class dushuju {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\myFile\\fos.txt");

        //public int read(byte[] b) throws IOException
        //      从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
        //      读入缓冲区的字节总数，读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1


        //循环改进
        byte[] b = new byte[1024];//1024及其整数倍
        int len;
        while((len = fis.read(b)) != -1){
            System.out.println(len);
            System.out.print(new String(b, 0, len));
        }
//        while(fis.read(b) != -1){
////            System.out.println(len);
////            System.out.print(new String(b, 0, len));
//            System.out.println(new String(b, 0, 14));
        //这样子虽然可以不用定义len，但是得手动确定个数，比较麻烦
//        }

        fis.close();
       /*
       byte[] b = new byte[5];
       //第一次读取数据
        int len = fis.read(b);
        System.out.println(len);
        //public String(byte[] bytes)
        //  通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String
//        System.out.println(new String(b));
        System.out.println(new String(b, 0, len));

        //第二次读取数据
        len = fis.read(b);
        System.out.println(len);
//        System.out.println(new String(b));
        System.out.println(new String(b, 0, len));


        //第三次读取数据
//        len = fis.read(b);
//        System.out.println(len);
//        System.out.println(new String(b));
        *//*
            hello\r\n
            world\r\n

            第一次：hello
            第二次：\r\nwor
            第三次：ld\r\nr
                这里的r是因为第二次读取，字节数组中最后一个是r，而第三次读取只读取了四个字节，所以在字节数组中最后一个字节r没有被替换
         *//*
        //第三次读取数据
        len = fis.read(b);
        System.out.println(len);
//        System.out.println(new String(b));
        System.out.println(new String(b, 0, len));//将指定长度的字节数组转换成字符串*/


    }
}
