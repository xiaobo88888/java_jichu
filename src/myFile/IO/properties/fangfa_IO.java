package myFile.IO.properties;

import java.io.*;
import java.util.Properties;

/*
    1.public void load(InputStream inStream) 从输入字节流中读取属性列表（键和元素对）。
    2.public void load(Reader reader)  按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
    3.public void store(OutputStream out, comments)
        以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
    4.public void store(Writer writer,String comments)
        以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
 */
public class fangfa_IO {
    public static void main(String[] args) throws IOException{
        //myStore();
        //myLoad();
        //myStore2();
        myLoad2();
    }

    private static void myLoad2() throws IOException{
        //1.public void load(InputStream inStream) 从输入字节流中读取属性列表（键和元素对）。
        Properties pro = new Properties();

        FileInputStream fis = new FileInputStream("E:\\java_File\\Properties_IO2.txt");

        pro.load(fis);

        System.out.println(pro);
    }

    private static void myStore2() throws IOException{
        Properties pro = new Properties();

        pro.setProperty("刘博", "男");
        pro.setProperty("煤球", "女");
        pro.setProperty("高辉", "女");

        FileOutputStream fos = new FileOutputStream("E:\\java_File\\Properties_IO2.txt");

        //3.public void store(OutputStream out, comments)
        //  以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
        pro.store(fos, null);

        fos.close();

    }

    private static void myLoad() throws IOException{
        //2.public void load(Reader reader)  按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。

        Properties pro = new Properties();
        FileReader fr = new FileReader("E:\\java_File\\Properties_IO.txt");

        pro.load(fr);

        System.out.println(pro);
    }

    private static void myStore() throws IOException {
        Properties pro = new Properties();

        pro.setProperty("刘博", "男");
        pro.setProperty("煤球", "女");
        pro.setProperty("高辉", "女");

        //4.public void store(Writer writer,String comments)
        //  以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
        FileWriter fw = new FileWriter("E:\\java_File\\Properties_IO.txt");
        pro.store(fw, null);//comments是一个描述信息

        fw.close();
    }
}
