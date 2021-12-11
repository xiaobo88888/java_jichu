package myFile.IO.zifuliu_anli;

import java.io.*;

/*
    把E:\\需要复制出来的代码 这个文件夹复制到E:\\java_File文件夹内

    思路：
        1.创建数据源File对象，路径是E:\\需要复制出来的代码
        2.创建目的地File对象，路径是E:\\java_File
        3.写方法实现文件夹的复制，参数为数据源File对象，目的地File对象
        4.判断数据源File是否是目录
            是
                a.在目的地下创建和File名称一样的目录
                b.获取数据源File下所有文件或目录的File数组
                c.遍历该File数组，得到每一个File对象
                d.把该File对象作为数据源File对象，递归调用复制文件夹的方法

            否
                说明是文件，直接复制，用字节流
 */
public class fuzhi_duowenjianjia {
    public static void main(String[] args) throws IOException{
        //1.创建数据源File对象，路径是E:\\需要复制出来的代码
        File fileYuan = new File("E:\\需要复制出来的代码");

        //2.创建目的地File对象，路径是E:\\java_File
        File fileMudi = new File("E:\\java_File");

        //3.写方法实现文件夹的复制，参数为数据源File对象，目的地File对象
        copyFile(fileYuan, fileMudi);
    }
    //3.写方法实现文件夹的复制，参数为数据源File对象，目的地File对象
    public static void copyFile(File fileYuan, File fileMudi) throws IOException {
        //如果fileYuan是个目录
        if(fileYuan.isDirectory()){
            //a.在目的地下创建和File名称一样的目录
            String directoryName = fileYuan.getName();
            File newFile = new File(fileMudi, directoryName);
            if(!newFile.exists()) {
                newFile.mkdir();
            }

            // b.获取数据源File下所有文件或目录的File数组
            File[] files = fileYuan.listFiles();

            //c.遍历该File数组，得到每一个File对象
            for (File f : files){
                //d.把该File对象作为数据源File对象，递归调用复制文件夹的方法
                copyFile(f, newFile);
            }
        }
        if(fileYuan.isFile()){
            String filename = fileYuan.getName();
            File newFile = new File(fileMudi, filename);

            fuzhiwenjian(fileYuan, newFile);
        }
    }
    public static void fuzhiwenjian(File fileYuan, File fileMudi)throws IOException{
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
