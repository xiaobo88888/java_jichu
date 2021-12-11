package wangluo_biancheng.UDP;

import lei.Scanner_Test;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/*
    数据来源于键盘录入，直到录入的数据是886，则发送结束
 */
public class UDP_fasong_lianxi {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner in = new Scanner(System.in);
        String shuju;

        while((shuju = in.nextLine()) != null){
            if(shuju.equals("886")){
                break;
            }

            byte[] bytes = shuju.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("10.100.22.163"), 10086);

            ds.send(dp);
        }

        ds.close();
    }
}
