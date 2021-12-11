package myFile.IO.dayinliu;

import java.io.*;

public class fuzhi_java {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\复制java文件.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\复制java文件3.java"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
         */

        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\复制java文件.java"));
        //使用打印流改进读数据
        PrintWriter pw = new PrintWriter(new FileWriter("E:\\java_File\\复制java文件3.java"), true);

        String line;
        while((line = br.readLine()) != null){
            pw.println(line);
        }

        br.close();
        pw.close();
    }
}
