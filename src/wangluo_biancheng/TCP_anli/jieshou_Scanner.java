package wangluo_biancheng.TCP_anli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class jieshou_Scanner {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);

        Socket s = ss.accept();

//        InputStream is = s.getInputStream();
//        byte[] bytes = new byte[1024];
//        int len = is.read(bytes);
//
//        System.out.println(new String(bytes, 0, len));

            //字符缓冲流读数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String shuju;
        while ((shuju = br.readLine()) != null) {
            System.out.println(shuju);
        }

        s.close();
        ss.close();
    }
}
