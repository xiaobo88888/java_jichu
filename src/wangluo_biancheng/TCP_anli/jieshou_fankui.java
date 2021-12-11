package wangluo_biancheng.TCP_anli;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class jieshou_fankui {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        System.out.println("服务器" + new String(bytes, 0, len));


        //服务器给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已接收".getBytes());

        s.close();
        ss.close();


    }
}
