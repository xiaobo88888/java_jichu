package myFile.IO.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class anli {
    public static void main(String[] args)throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("E:\\java_File\\猜数字计数器.txt");

        pro.load(fr);//将fr中的数据读取存储到集合pro中

        fr.close();

        String s = pro.getProperty("count");//根据键count来得到值
        int num = Integer.parseInt(s);//将字符串类型转成int型

        if(num > 2){
            System.out.println("试玩次数已到期");
        }else{
            game.start();//玩游戏

            num++;
            pro.setProperty("count", String.valueOf(num));//修改pro集合中的值

            FileWriter fw = new FileWriter("E:\\java_File\\猜数字计数器.txt");
            pro.store(fw,null);//将集合pro中的数据写入fw文件中
            fw.close();
        }

    }
}
