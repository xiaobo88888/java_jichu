package wangluo_biancheng.TCP_anli;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class jieshou_xieruwenben_fankui_duoxiancheng {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10006);

        while(true) {//模拟服务器一直接收客户端传递的数据
            //监听客户端连接
            Socket s = ss.accept();
            //为每一个客户端提供一个线程
            new Thread(new fasongThread(s)).start();

        }

//        ss.close();  服务器一般不关闭

    }
}
