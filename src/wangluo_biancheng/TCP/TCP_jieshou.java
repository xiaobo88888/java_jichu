package wangluo_biancheng.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据的步骤：
        1.创建服务器端的Socket对象(ServerSocket)
        2.获取输入流，读数据，并把数据显示在控制台
        3.释放资源


    ServerSocket:此类实现服务器套接字。服务器套接字等待请求通过网络传入
        public ServerSocket(int port) throws IOException
            创建绑定到特定端口的服务器套接字。端口 0 在所有空闲端口上创建套接字。
        public Socket accept() throws IOException
            侦听并接受到此套接字的连接。此方法在连接传入之前一直阻塞
*/
public class TCP_jieshou {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端的Socket对象(ServerSocket)
        //public ServerSocket(int port) throws IOException
        ServerSocket ss = new ServerSocket(10000);

        //侦听并接受到此套接字的连接
        Socket s = ss.accept();

        //2.获取输入流，读数据，并把数据显示在控制台
        InputStream is = s.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        //3.释放资源
        s.close();
        ss.close();

    }
}
