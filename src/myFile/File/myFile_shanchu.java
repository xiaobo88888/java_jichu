package myFile.File;

import java.io.File;
import java.io.IOException;

/*
*   File类删除功能
*       public boolean delete();删除由此抽象路径名表示的文件或目录
* */
public class myFile_shanchu {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("E:\\java_File\\java1.txt");//绝对路径
        //需求1：在当前模块目录下创建java1.txt文件
        File f1 = new File("src\\java1.txt");//相对路径
//        System.out.println(f1.createNewFile());
        //需求2：在当前模块目录下删除java1.txt文件
//        System.out.println(f1.delete());

        //需求3：在当前模块下创建case目录
        File f2 = new File("src\\cast");
//        System.out.println(f2.mkdir());
        //需求4：在当前模块下删除case目录
//        System.out.println(f2.delete());

        //需求5：在当前模块下创建目录cast，在当前目录下创建java.txt文件
        File f3 = new File("src\\cast");
//        System.out.println(f3.mkdir());
        File f4 = new File("src\\cast\\java.txt");
        //如果创建文件时，上级目录不存在，就会报异常，所以说创建文件之前要创建目录
//        System.out.println(f4.createNewFile());
        //需求6：删除当前模块下的目录cast
        System.out.println(f4.delete());//所以需要先删除目录下的内容
        System.out.println(f3.delete());//如果要删除的目录下面由内容，是不能直接删除的

    }
}
