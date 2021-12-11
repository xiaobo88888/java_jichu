package myFile.IO.zijie_dushuju;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class dushuju_fuzhitupian {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\15779172334\\Desktop\\刘博-全国大学生创新创业大赛\\刘博报名成功截图.png");
        FileOutputStream fos = new FileOutputStream("E:\\java_File\\复制图片.png");

        byte[] b = new byte[1024];
        int len;
        while((len = fis.read(b)) != -1){//一次读取一个字节数组，一次写入一个字节数组
            fos.write(b, 0, len);
        }


        //图片体积较大，如果采取一次读写一个字节将会耗时很长的时间
//        int b;
//        while((b = fis.read()) != -1){
//            fos.write(b);
//        }

        fos.close();
        fis.close();
    }
}
