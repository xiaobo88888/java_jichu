package myFile.IO.zifuliu_anli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：把文本文件中的数据读取到集合中，并遍历集合。文件中的每一行数据是一个集合元素
 */
public class wenjian_jihe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\bw3.txt"));

        ArrayList<String> array = new ArrayList<String>();

        String line;
        while((line = br.readLine()) != null){
            array.add(line);
        }

        for (String s : array){
            System.out.println(s);
        }

        br.close();
    }
}
