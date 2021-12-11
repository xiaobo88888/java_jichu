package myFile.File;

import java.io.File;

public class myFile_digui_bianlimulu {
    public static void main(String[] args) {
        File f = new File("E:\\java_File");

        getFile(f);
    }
    public static void getFile(File ff){//递归找出指定路径下的所有文件
        File[] files = ff.listFiles();
        for (File fff : files){
            if(fff.isDirectory()){
                getFile(fff);
            } else{
                System.out.println(fff.getAbsoluteFile());
            }
        }

    }
}
