package myFile.IO.zijie_xieshuju;

import java.io.FileOutputStream;
import java.io.IOException;

/*
        1.字节流写数据如何实现换行
            Windows:\r\n
            Linux:\n
            mac:\r
        2.字节流写数据如何实现追加写入
            public FileOutputStream(String name,boolean append) throws FileNotFoundException
                创建一个向具有指定 name 的文件中写入数据的输出文件流。
                如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处

 */
public class xieshuju_xiaowenti {
    public static void main(String[] args) throws IOException {
        //创建对象
//        FileOutputStream fos = new FileOutputStream("src\\myFile\\fos.txt");
        FileOutputStream fos = new FileOutputStream("src\\myFile\\fos.txt", true);

        //写数据
        for (int i = 0; i < 10; i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        //释放资源
        fos.close();
    }
}
