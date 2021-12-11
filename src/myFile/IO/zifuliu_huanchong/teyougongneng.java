package myFile.IO.zifuliu_huanchong;

import java.io.*;

/*
    字符缓冲流的特定功能：
       BufferedWriter:
            void newLine();写入一个行分隔符

       BufferedReader:
            public String readLine();
                读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行
                返回包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 */
public class teyougongneng {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\bw2.txt"));
//
//        for (int i = 0; i < 10; i++){
//            bw.write("hello" + i);
////            bw.write("\r\n");//最好不要这么写，只适用于Windows系统
//            bw.newLine();
//            bw.flush();
//        }
//
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\bw2.txt"));

        //public String readLine();

//        //第一次读一行
//        String line = br.readLine();
//        System.out.println(line);
//
//        //第二次读一行
//        String line2 = br.readLine();
//        System.out.println(line2);
//
//        //再多读两行
//        String line3 = br.readLine();
//        System.out.println(line3);
//
//        String line4 = br.readLine();
//        System.out.println(line4);

        //循环读取
        String line;
        while((line = br.readLine()) != null){
//            System.out.print(line);//返回包含该行内容的字符串，不包含任何行终止符
            System.out.println(line);//所以你得用println来自己加入换行
        }

        br.close();
    }
}
