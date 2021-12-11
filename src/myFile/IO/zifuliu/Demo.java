package myFile.IO.zifuliu;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
        如果读取的是汉字，用字节流的话不是很方便，一个一个字节读取的话会出现特殊符号

        字符流 = 字节流 + 编码表

        如何识别中文：
                无论哪种编码，第一个字节都是负数

        一个汉字存储：
            如果是GBK编码，占用两个字节
            如果是UTF-8编码，占用三个字节


        public byte[] getBytes(String charsetName) throws UnsupportedEncodingException
            使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中

        public static String toString(byte[] a)
            返回指定数组内容的字符串表示形式
 */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "刘博";//[-27, -120, -104, -27, -115, -102]
//        byte[] by = s.getBytes();
//        byte[] by = s.getBytes("UTF-8");//IDEA默认使用UTF-8编码
        byte[] by = s.getBytes("GBK");//[-63, -11, -78, -87]
        System.out.println(Arrays.toString(by));
    }
}
