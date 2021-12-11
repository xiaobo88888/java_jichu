package myFile.IO.zijie_huanchong;

import java.io.*;

/*
        需求：
            1.基本字节流一次读写一个字节      耗时最长
            2.基本字节流一次读写一个字节数组
            3.字节缓冲流一次读写一个字节
            4.字节缓冲流一次读写一个字节数组   耗时最短
 */
public class huanchong_fuzhishipin {
    public static void main(String[] args) throws  IOException{
        //开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
        //1.基本字节流一次读写一个字节
//        method1();

        //2.基本字节流一次读写一个字节数组
//        method2();

        //3.字节缓冲流一次读写一个字节
//        method3();

        //4.字节缓冲流一次读写一个字节数组
        method4();

        //结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时" + (endTime - startTime) + "毫秒");
    }

    //1.基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\近藤浩治 - 地上BGM.wav");
        FileOutputStream fos = new FileOutputStream("E:\\java_File\\复制音频.wav");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }

        fos.close();
        fis.close();
    }

    //2.基本字节流一次读写一个字节数组
    public static void method2() throws  IOException{
        FileInputStream fis = new FileInputStream("D:\\近藤浩治 - 地上BGM.wav");
        FileOutputStream fos = new FileOutputStream("E:\\java_File\\复制音频.wav");

        byte[] b = new byte[1024];
        int len;
        while((len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }

        fis.close();
        fos.close();
    }

    //3.字节缓冲流一次读写一个字节
    public static void method3() throws IOException{
        FileInputStream fis = new FileInputStream("D:\\近藤浩治 - 地上BGM.wav");
        BufferedInputStream bos1 = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("E:\\java_File\\复制音频.wav");
        BufferedOutputStream bos2 = new BufferedOutputStream(fos);

        int b;
        while((b = bos1.read()) != -1){
            bos2.write(b);
        }


        bos1.close();
        bos2.close();
        fis.close();
        fos.close();

    }

    //4.字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException{
        FileInputStream fis = new FileInputStream("D:\\近藤浩治 - 地上BGM.wav");
        BufferedInputStream bos1 = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("E:\\java_File\\复制音频.wav");
        BufferedOutputStream bos2 = new BufferedOutputStream(fos);

        byte[] b = new byte[1024];
        int len;
        while((len = bos1.read(b)) != -1){
            bos2.write(b, 0, len);
        }

        bos1.close();
        bos2.close();
        fis.close();
        fos.close();
    }
}
