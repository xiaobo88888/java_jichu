package myFile.File;

import java.io.File;
import java.io.IOException;

/*
*   File类创建功能：
*       1.public boolean createNewFile()
*                       throws IOException; 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
*           如果文件不存在，则创建文件，并返回true
*           如果文件存在，则不创建文件，并返回false
*       2.public boolean mkdir(); 创建有此抽象路径名命名的目录
*           这个只能创建单级目录，且父目录必须存在
*           如果目录不存在，则创建目录，并返回true
 *          如果目录存在，则不创建目录，并返回false
*       3.public boolean mkdirs(); 创建有此抽象路径名命名的目录，包括任何必须但不存在的父目录
*           它可以创建多级目录，父目录可以不存在
*           如果目录不存在，则创建目录，并返回true
 *          如果目录存在，则不创建目录，并返回false
* */
public class myFile_chuangjian {
    public static void main(String[] args) throws IOException {
        //需求1：在E:\\java_File目录下创建一个文件java.txt
        File f1 = new File("E:\\java_File\\java.txt");
        System.out.println(f1.createNewFile());

        //需求2：在E:\\java_File目录下创建一个目录javaSE
        File f2 = new File("E:\\java_File\\javaSE");
        System.out.println(f2.mkdir());

        //需求3：在E:\\java_File目录下创建一个多级目录javaWEB\\HTML
        File f3 = new File("E:\\java_File\\javaWEB\\HTML");
//        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());

        //需求4：在E:\\java_File目录下创建一个文件javase.txt
        File f4 = new File("E:\\java_File\\javase.txt");
//        System.out.println(f4.mkdir());
        //如果用mkdir()方法，那么会创建一个目录，所以最终创建文件还是目录需要判断看调用的方法，而不是看路径名
        System.out.println(f4.createNewFile());
        //如果E:\java_File目录下存在javase.txt，即使javase.txt是目录，也创建不成功，因为名字相同
    }
}
