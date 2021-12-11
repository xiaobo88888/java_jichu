package myFile.IO.zijie_xieshuju;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    try{

    }catch{

    }finally{

    }
 */
public class xieshuju_yichang {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("src\\myFile\\fos.txt");
//
//            fos.write("hello".getBytes());
//
//            fos.close();//释放资源的这段代码必须执行
//        }catch(IOException e){
//            e.printStackTrace();
//        }
        FileOutputStream fos = null;//得使用null初始化
        try {
//            fos = new FileOutputStream("Z:\\src\\myFile\\fos.txt");
            fos = new FileOutputStream("src\\myFile\\fos.txt");

            fos.write("hello".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           if(fos != null) {//如果上层的try没有执行，fos就是null，null来执行close就会抛出空指针异常
                               // NullPointerException
                try {
                    fos.close();//释放资源的这段代码必须执行
                } catch (IOException e) {
                    e.printStackTrace();
                }
           }
        }

    }
}
