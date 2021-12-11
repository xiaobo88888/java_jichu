package wangluo_biancheng.TCP_anli;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class fasong_Scanner_ {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.100.22.163", 10003);

        Scanner in = new Scanner(System.in);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String shuju;
        while((shuju = in.nextLine()) != null){
            if(shuju.equals("886")){
                break;
            }

            bw.write(shuju);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        s.close();
    }
}
