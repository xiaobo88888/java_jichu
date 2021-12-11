package wangluo_biancheng.TCP_anli;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class jieshou_xieruwenben {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10004);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\接收到的数据写入文本.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
        s.close();
        ss.close();

    }

}
