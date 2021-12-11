package myFile.IO.zifuliu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
        InputStreamReader可以简写成FileReader，是它的子类
        OutputStreamWriter可以简写成FileWriter，是它的子类
        但是如果遇到编码和解码问题就必须使用InputStreamReader,OutputStreamWriter

        转化流的名字过长，而我们常见的操作都是按照本地默认编码实现的，所以为了简化书写，转化流提供了对应的子类
        FileReader:用于读取字符文件的便捷类
            FileReader(String FileName);
        FileWriter:用于写入字符文件的便捷类:
            FileWriter(String FileName);

        数据源和目的地的分析：
            数据源："src\\myFile\\IO\\myIO_fenlei.java"----读数据----Reader---InputStreamReader---FileReader
            目的地："E:\\java_File\\复制java文件.java"---写数据---Writer---OutputStreamWriter---FileWriter
 */
public class FileReader_FileWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\myFile\\IO\\myIO_fenlei.java");
        FileWriter fw = new FileWriter("E:\\java_File\\复制java文件.java");

        //一次读一个字符
//        int c;
//        while((c = fr.read()) != -1){
//            fw.write(c);//不需要加fw.flush();，在下面的fw.close();刷新一次就行了
//        }

        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = fr.read(chs)) != -1){
            fw.write(chs, 0, len);
        }

        fw.close();//刷新一次就行了
    }
}
