package wangluo_biancheng.TCP_anli;

import java.io.*;
import java.net.Socket;

public class fasong_laiziwenben_fankui_ {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.100.22.163", 10006);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\发送的数据来及文本_反馈_.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //发送终止指令
        s.shutdownOutput();

        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("客户端" + new String(bytes, 0, len));

        is.close();
        br.close();
        bw.close();
        s.close();

    }
}
