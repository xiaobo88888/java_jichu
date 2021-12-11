package myFile.IO.zifuliu_huanchong;

import java.io.*;

public class fuzhi_java_new {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\bw2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\bw3.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            //因为使用readLine()方法不会读取换行符，所以得自己手动添加
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();

    }
}
