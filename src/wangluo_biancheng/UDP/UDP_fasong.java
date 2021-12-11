package wangluo_biancheng.UDP;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据的步骤：
        1.创建发送端的Socket对象(DatagramSocket)
        2.创建数据并把数据打包
        3.调用DatagramSocket对象的方法发送数据
        4.关闭发送端


    DatagramSocket
        此类表示用来发送和接收数据报包的套接字

        public void close()
            关闭此数据报套接字
        public void send(DatagramPacket p) throws IOException
            从此套接字发送数据报包
            DatagramPacket 包含的信息指示：将要发送的数据、其长度、远程主机的 IP 地址和远程主机的端口号

    DatagramPacket
        此类表示数据报包

        public DatagramPacket(byte[] buf,int length,InetAddress address,int port)
            构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。length 参数必须小于等于 buf.length。
            byte[] buf：表示要发送的数据
            int length：表示发送的指定的长度
            InetAddress address：表示远程主机的 IP 地址
            int port：表示远程主机的端口号
 */
public class UDP_fasong {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //2.创建数据并把数据打包
        //public DatagramPacket(byte[] buf,int length,InetAddress address,int port)
        byte[] buf = "hello, world, java, UDP, 网络编程".getBytes();
//        int length = buf.length;
//        InetAddress ia = InetAddress.getByName("10.100.22.163");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(buf, length, ia, port);
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.100.22.163"), 10086);

        //3.调用DatagramSocket对象的方法发送数据
        //        public void send(DatagramPacket p) throws IOException
        ds.send(dp);

        //4.关闭发送端
        //public void close()
        ds.close();
    }
}
