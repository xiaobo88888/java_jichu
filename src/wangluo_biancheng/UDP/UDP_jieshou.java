package wangluo_biancheng.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP接收数据的步骤：
        1.创建接收端的Socket对象(DatagramSocket)
        2.创建一个数据包，用于接收数据
        3.调用DatagramSocket对象的方法接收数据
        4.解析数据包，并把数据在控制台上显示
        5.关闭接收端

    DatagramSocket:
        public DatagramSocket(int port) throws SocketException
            创建数据报套接字并将其绑定到本地主机上的指定端口
        public void receive(DatagramPacket p) throws IOException
            从此套接字接收数据报包


    DatagramPacket:
        public DatagramPacket(byte[] buf, int length)
            构造 DatagramPacket，用来接收长度为 length 的数据包。
        public byte[] getData()
            返回数据缓冲区。接收到的或将要发送的数据从缓冲区中的偏移量 offset 处开始，持续 length 长度。
        public int getLength()
            返回将要发送或接收到的数据的长度

 */
public class UDP_jieshou {
    public static void main(String[] args) throws IOException {
        //1.创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10086);

        //2.创建一个数据包，用于接收数据
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        //3.调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //4.解析数据包，并把数据在控制台上显示
//        byte[] data = dp.getData();
//        int length = dp.getLength();
//        String shuju = new String(data, 0, length);
//        System.out.println("数据是" + shuju);
        System.out.println("数据是" + new String(dp.getData(), 0, dp.getLength()));

        //5.关闭接收端
        ds.close();
    }
}
