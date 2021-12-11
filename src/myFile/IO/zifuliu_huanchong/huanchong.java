package myFile.IO.zifuliu_huanchong;

import java.io.*;

/*
    字符缓冲流：
        BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。
                       可以指定缓冲区的大小，或者接受默认的大小。默认值足够大，可以用于大多数用途

        BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
                       可以指定缓冲区的大小，或者可使用默认的大小。默认值足够大，可以用于大多数用途

    构造方法：
        BufferedWriter(Writer out);
        BufferedReader(Reader in);

 */
public class huanchong {
    public static void main(String[] args) throws IOException {
        //BufferedWriter(Writer out);
//        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\bw.txt"));
//
//        bw.write("刘博\r\n");
//        bw.write("java\r\n");
//
//        bw.close();

        //BufferedReader(Reader in);
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\bw.txt"));

        //一次读一个字符
//        int c;
//        while((c = br.read()) != -1){
//            System.out.print((char)c);
//        }

        //一次读一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            System.out.println(new String(chs, 0, len));
        }

        br.close();
    }
}
