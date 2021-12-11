package wangluo_biancheng.UDP;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP_jieshou_lianxi {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        while(true){
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            ds.receive(dp);

            byte[] datas = dp.getData();
            int length = dp.getLength();
            String shuju = new String(datas, 0, length);
            System.out.println("数据是" + shuju);
        }

//        ds.close();
    }
}
