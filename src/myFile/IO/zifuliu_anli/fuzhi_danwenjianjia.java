package myFile.IO.zifuliu_anli;

import java.io.*;

/*
    单极文件夹：
        该目录下只有文件，没有文件夹

    需求：
        把E:\\需要复制出来的代码  这个文件夹复制到E:\\java_File  这个文件夹下

    思路：
        1.创建数据源目录File对象，路径是 E:\\需要复制出来的代码
        2.获取数据源目录File对象的名称(需要复制出来的代码)——这是为了代码可重复，可以只修改路径就复制别的代码
        3.创建目的地目录File对象，路径名是(E:\\java_File) + 对象名(需要复制出来的代码)  (E:\\java_File\\需要复制出来的代码)
        4.判断目的地目录对应的File是否存在，如果不存在，就创建
        5.获取数据源目录下的所有文件的File数组
        6.遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
                例：E:\\需要复制出来的代码\\科技月月评总.cpp
        7.获取数据源文件File对象的名称(科技月月评总.cpp)
        8.创建目的地文件File对象，路径名是 目的地目录+科技月月评总.cpp组成的 (E:\\java_File\\需要复制出来的代码\\科技月月评总.cpp)
        9.复制文件
            由于不止有文本文件，所以采用字节流


 */
public class fuzhi_danwenjianjia {
    public static void main(String[] args) throws IOException {
        //1.创建数据源目录File对象，路径是 E:\\需要复制出来的代码
        File file = new File("E:\\需要复制出来的代码");

        //2.获取数据源目录File对象的名称(需要复制出来的代码)——这是为了代码可重复，可以只修改路径就复制别的代码
            //public String getName() 返回由此抽象路径名表示的文件或目录的名称
        String fileName = file.getName();

        //3.创建目的地目录File对象，路径名是(E:\\java_File) + 对象名(需要复制出来的代码)  (E:\\java_File\\需要复制出来的代码)
            //File(File parent, String child);从父抽象数据名和子路径名字符串创建新的File实例
        File file2 = new File("E:\\java_File", fileName);

        //4.判断目的地目录对应的File是否存在，如果不存在，就创建
            //public boolean exists() 测试此抽象路径名表示的文件或目录是否存在
            //public boolean mkdir(); 创建有此抽象路径名命名的目录
        if (!file2.exists()){//如果不存在就创建目录
            file2.mkdir();//先创建目录
        }

        //5.获取数据源目录下的所有文件的File数组
            //public File[] listFiles() 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件
        File[] files = file.listFiles();

        //6.遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File f : files){
            //public boolean isFile() 测试此抽象路径名表示的文件是否是一个标准文件
            if(f.isFile()){

                //7.获取数据源文件File对象的名称(科技月月评总.cpp)
                String fName = f.getName();

                //8.创建目的地文件File对象，路径名是 目的地目录+科技月月评总.cpp组成的 (E:\\java_File\\需要复制出来的代码\\科技月月评总.cpp)
                File filemudi = new File(file2, fName);

                //9.复制文件
                copyFile(f, filemudi);
            }
        }
    }

    private static void copyFile(File f, File filemudi) throws IOException {
        //创建读
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        //创建写
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filemudi));

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }

        bis.close();
        bos.close();
    }
}
