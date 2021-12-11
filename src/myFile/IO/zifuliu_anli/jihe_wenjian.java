package myFile.IO.zifuliu_anli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    把ArrayList集合中的字符串写入到文本文件中，要求每一个字符串作为文件中的一行数据
 */
public class jihe_wenjian {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\集合到文件.txt"));

        for (String s : array){
            bw.write(s);
            bw.newLine();;
            bw.flush();
        }

        bw.close();
    }
}
