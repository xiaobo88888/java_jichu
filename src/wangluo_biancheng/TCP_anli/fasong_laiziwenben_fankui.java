package wangluo_biancheng.TCP_anli;

import java.io.*;
import java.net.Socket;

/*
    public void shutdownOutput() throws IOException
        禁用此套接字的输出流。对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列
 */
public class fasong_laiziwenben_fankui {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.100.22.163", 10005);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\发送的数据来自文本_反馈.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        //public void shutdownOutput() throws IOException
        s.shutdownOutput();

        //接收反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);//而客户端传输完了数据后也在这等服务器的反馈
        System.out.println("客户端" + new String(bytes, 0, len));

        br.close();
        bw.close();
        s.close();
    }
}
