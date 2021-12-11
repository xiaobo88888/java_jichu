package wangluo_biancheng.TCP_anli;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class jieshou_Scanner_wenben {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10003);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\网络编程键盘录入.txt"));

        String shuju;
        while((shuju = br.readLine()) != null){
            //写入文本
            bw.write(shuju);
            bw.newLine();
            bw.flush();
        }

        bw.close();

        br.close();
        s.close();
        ss.close();

    }
}
