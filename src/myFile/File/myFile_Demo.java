package myFile.File;

import java.io.File;

/*
*   File:文件和目录路径名的抽象表示
*       1.文件和目录是可以通过File封装成对象的
*       2.对File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已，它可以是存在的，也可以是不存在的
*         将来是要通过具体的操作把这个路径的内容转化为具体存在的
*
*   构造方法：
*       1.File(String pathname);通过将给定的路径名字符串转化成抽象路径名来创建新的File实例
*       2.File(String parent, String child);从父路径名字符串和子路径名字符串创建新的File实例
*       3.File(File parent, String child);从父抽象数据名和子路径名字符串创建新的File实例
* */
public class myFile_Demo {
    public static void main(String[] args) {
        //1.File(String pathname);通过将给定的路径名字符串转化成抽象路径名来创建新的File实例
        File f1 = new File("E:\\java_File\\java1.txt");
        //而且这里我提供的路径是不存在的，但并没有报错，所以这里仅仅是抽象路径的表示形式，不需要真正存在
        System.out.println(f1);//E:\java_File\java1.txt
        //所以File重写了toString方法

        // 2.File(String parent, String child);从父路径名字符串和子路径名字符串创建新的File实例
        File f2 = new File("E:\\java_File", "java1.txt");
        System.out.println(f2);

        //3.File(File parent, String child);从父抽象数据名和子路径名字符串创建新的File实例
        File f3 = new File("E:\\java_File");
        File f4 = new File(f3, "java1.txt");
        System.out.println(f4);
    }
}
