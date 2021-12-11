package wangluo_biancheng.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP发送数据的步骤：
        1.创建客户端的Socket对象
        2.获取输出流，写数据
        3.释放资源

    Socket:此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
        public Socket(InetAddress address,int port) throws IOException
            创建一个流套接字并将其连接到指定 IP 地址的指定端口号。
        public Socket(String host,int port) throws UnknownHostException,IOException
            创建一个流套接字并将其连接到指定主机上的指定端口号
        public OutputStream getOutputStream() throws IOException
            返回此套接字的输出流。
 */
public class TCP_fasong {
    public static void main(String[] args) throws IOException {
        //1.创建客户端的Socket对象
        //public Socket(InetAddress address,int port) throws IOException
//        Socket so = new Socket(InetAddress.getByName("10.100.22.163"), 10000);
        Socket so = new Socket("10.100.22.163", 10000);

        //2.获取输出流，写数据
        //public OutputStream getOutputStream() throws IOException
        OutputStream out = so.getOutputStream();
        out.write("hello, world, TCP, 你爸爸来了".getBytes());

        //3.释放资源
        so.close();

    }
}
