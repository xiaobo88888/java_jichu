package myFile.File;

import java.io.File;

/*
*   File类的判断和获取功能
*       public boolean isDirectory() 测试此抽象路径名表示的文件是否是一个目录
*       public boolean isFile() 测试此抽象路径名表示的文件是否是一个标准文件
*       public boolean exists() 测试此抽象路径名表示的文件或目录是否存在
*
*       public File getAbsoluteFile() 返回此抽象路径名的绝对路径名形式
*       public String getPath()将此抽象路径名转换为一个路径名字符串
*       public String getName() 返回由此抽象路径名表示的文件或目录的名称
*           该名称是路径名名称序列中的最后一个名称。如果路径名名称序列为空，则返回空字符串
*
*       public String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录
*       public File[] listFiles() 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件*/
public class myFile_panduan_huoqu {
    public static void main(String[] args) {
        File f1 = new File("E:\\java_File\\java.txt");

//        public boolean isDirectory() 测试此抽象路径名表示的文件是否是一个目录
//        public boolean isFile() 测试此抽象路径名表示的文件是否是一个标准文件
//        public boolean exists() 测试此抽象路径名表示的文件或目录是否存在
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

//        public File getAbsoluteFile() 返回此抽象路径名的绝对路径名形式
//        public String getPath()将此抽象路径名转换为一个路径名字符串
//        public String getName() 返回由此抽象路径名表示的文件或目录的名称
//                该名称是路径名名称序列中的最后一个名称。如果路径名名称序列为空，则返回空字符串
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("---------------");

        //public String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录
        //public File[] listFiles() 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件
        File f2 = new File("E:\\java_File");
        String[] strFile= f2.list();
        for (String s : strFile){
            System.out.println(s);
        }
        File[] files = f2.listFiles();
        for(File f : files){
//            System.out.println(f);
//            System.out.println(f.getName());
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }


    }
}
