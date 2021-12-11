package myFile.IO.zifuliu;

import java.io.*;

/*
        InputStreamReader:是从字节流到字符流的桥梁
                它使用指定的 charset(编码) 读取字节并将其解码为字符
                它使用的字符集可以由名称指定或显式给定，或者可以接受平台默认的字符集。

                public InputStreamReader(InputStream in)
                        创建一个使用默认字符集的 InputStreamReader
                public InputStreamReader(InputStream in,String charsetName)throws UnsupportedEncodingException
                        创建使用指定字符集的 InputStreamReader。

        OutputStreamWriter:字符流通向字节流的桥梁
                可使用指定的 charset(编码) 将要写入流中的字符编码成字节
                它使用的字符集可以由名称指定或显式给定，否则将接受平台默认的字符集。

                public OutputStreamWriter(OutputStream out)
                        创建使用默认字符编码的 OutputStreamWriter
                public OutputStreamWriter(OutputStream out,String charsetName)
                        创建使用指定字符集的 OutputStreamWriter。
 */
public class bianma_jiema_zifuliu {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter(OutputStream out)
//        创建使用默认字符编码的 OutputStreamWriter
//        OutputStreamWriter(OutputStream out, String charsetName)
//        创建使用指定字符集的 OutputStreamWriter

//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\java_File\\zifu.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\java_File\\zifu.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\java_File\\zifu.txt"), "GBK");
        osw.write("刘博");
        osw.close();


//        InputStreamReader(InputStream in)
//        创建一个使用默认字符集的 InputStreamReader
//        InputStreamReader(InputStream in, String charsetName)
//        创建使用指定字符集的 InputStreamReader

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\java_File\\zifu.txt"));
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\java_File\\zifu.txt"), "UTF-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\java_File\\zifu.txt"), "GBK");

        //一次读取一个字节
        int ch;
        while((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();
    }
}
