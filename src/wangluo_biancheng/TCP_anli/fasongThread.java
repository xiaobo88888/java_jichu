package wangluo_biancheng.TCP_anli;

import java.io.*;
import java.net.Socket;

public class fasongThread implements Runnable {
    private Socket s;
    public fasongThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter());

            //解决名称冲突问题
            int count = 0;
            File file = new File("E:\\java_File\\" + count +  "接收到的数据写入文本_反馈_多线程.txt");
            while(file.exists()){
                count++;
                file = new File("E:\\java_File\\" + count +  "接收到的数据写入文本_反馈_多线程.txt");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));


            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            OutputStream os = s.getOutputStream();
            os.write("数据接收成功".getBytes());

            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
