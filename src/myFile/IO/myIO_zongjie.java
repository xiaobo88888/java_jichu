package myFile.IO;

/*
                                    字节流
                       /                              \
                字节输入流                            字节输出流
                InputStream                          OutputStream
          int read();一次读取一个字节                void write(int by);一次写入一个字节
 int read(byte[] bytes);一次读取一个字节数组      void write(byte[] bytes, int off, int len);一次写入一个字节数组的一部分
          /                \                       /                 \
   FileInputStream    BufferedInputStream    FileOutputStream   BufferedOutputStream

         字节流可以复制任何文件，有四种方式复制，但一般采用用字节缓冲流一次读写一个字节数组




                                      字符流
                      /                                     \
                字符输入流                                 字符输出流
                Reader                                      Writer
        int read();一次读取一个字符                   void writer(int ch);一次写入一个字符
  int read(char[] chs);一次读取一个字符数组       void writer(char[] chs, int index, int len);一次写入一个字符数组
        /                  \                           /                       \
InputStreamReader      BufferedReader          OutputStreamWriter           BufferedWriter
                     String readLine();                                     void newLine();写一个换行符
                    一次读取一行，换行符不读取                                   void write(String line);一次写入一个字符串
FileReader                                         FileWriter
 */
public class myIO_zongjie {
    public static void main(String[] args) {

    }
}
