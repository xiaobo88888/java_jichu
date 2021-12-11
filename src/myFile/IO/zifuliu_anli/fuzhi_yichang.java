package myFile.IO.zifuliu_anli;

import java.io.*;

public class fuzhi_yichang {
    public static void main(String[] args) {

    }

    //JDK-9的改进方案
    public static void fuzhiwenjian4(File fileYuan, File fileMudi)throws IOException{

        BufferedInputStream br = new BufferedInputStream(new FileInputStream(fileYuan));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(fileMudi));

        try (br; bw){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = br.read(bytes)) != -1) {
                bw.write(bytes, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //JDK-7的改进方案
    public static void fuzhiwenjian3(File fileYuan, File fileMudi){
        try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(fileYuan));
             BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(fileMudi));){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = br.read(bytes)) != -1) {
                bw.write(bytes, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //try - catch - finally异常处理
    public static void fuzhiwenjian2(File fileYuan, File fileMudi){
        BufferedInputStream br = null;
        BufferedOutputStream bw = null;
        try {
            br = new BufferedInputStream(new FileInputStream(fileYuan));
            bw = new BufferedOutputStream(new FileOutputStream(fileMudi));

            byte[] bytes = new byte[1024];
            int len;
            while ((len = br.read(bytes)) != -1) {
                bw.write(bytes, 0, len);
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //抛出异常处理
    public static void fuzhiwenjian(File fileYuan, File fileMudi)throws IOException {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(fileYuan));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(fileMudi));

        byte[] bytes = new byte[1024];
        int len;
        while((len = br.read(bytes)) != -1){
            bw.write(bytes, 0, len);
        }

        bw.close();
        br.close();
    }
}
