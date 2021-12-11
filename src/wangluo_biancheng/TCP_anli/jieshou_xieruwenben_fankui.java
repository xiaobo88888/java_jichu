package wangluo_biancheng.TCP_anli;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class jieshou_xieruwenben_fankui {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10005);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\接收的数据写入文本_反馈.txt"));

        String line;
        while((line = br.readLine()) != null){//服务器不知道客户端已经传输完了数据，还在这等
            //根据标记名来结束循环
//            if(line.equals("886")){
//                /*
//                但是自定义结束标记会有误差，如果创数的文件中正好有自定义结束标记名，那么传输会提前结束
//                 */
//                break;
//            }

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //发送反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已接收".getBytes());

        os.close();
        bw.close();
        br.close();
        s.close();
        ss.close();




    }
}
