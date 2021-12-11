package myFile.IO.zifuliu_huanchong;

import java.io.*;

public class huanchong_fuzhijava {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\myFile\\File\\myFile_Demo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\复制java文件2.java"));

        long startTime = System.currentTimeMillis();

        //一次读写一个字符
//        int c;
//        while((c = br.read()) != -1){
//            bw.write(c);
//        }

        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs, 0, len);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("总共花费" + (endTime - startTime) + "毫秒");

        bw.close();
        br.close();
    }
}
