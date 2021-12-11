package wangluo_biancheng.TCP_anli;

import java.io.*;
import java.net.Socket;

public class fasong_laiziwenben {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.100.22.163", 10004);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\发送的数据来自文本.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
        s.close();
    }
}
