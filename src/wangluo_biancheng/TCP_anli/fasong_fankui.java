package wangluo_biancheng.TCP_anli;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class fasong_fankui {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.100.22.163", 10001);

        OutputStream os = s.getOutputStream();

        os.write("煤球大傻猪，刘博大帅比".getBytes());

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        System.out.println("客户端" + new String(bytes, 0, len));


        s.close();

    }
}
