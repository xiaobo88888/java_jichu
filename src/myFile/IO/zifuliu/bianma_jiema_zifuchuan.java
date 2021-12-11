package myFile.IO.zifuliu;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
        编码：
            byte[] getBytes(); 使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
            byte[] getBytes(String charsetName); 使用指定的字符集将该String编码为一系列字节，将结果
                                                 存储到新的字节数组中

        解码：
            String(byte[] bytes); 通过使用平台的默认字符集解码指定的字节数组来构造新的String
            String(byte[] bytes, String charsetName); 通过使用指定的字符集解码指定的字节数组来
                                                      构造新的String
  */
public class bianma_jiema_zifuchuan {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "煤球";

        //编码

//        byte[] bytes = s.getBytes();//[-25, -123, -92, -25, -112, -125]
//        System.out.println(Arrays.toString(bytes));

//        byte[] bytes = s.getBytes("UTF-8");//[-25, -123, -92, -25, -112, -125]
//        System.out.println(Arrays.toString(bytes));

        byte[] bytes = s.getBytes("GBK");//[-61, -70, -57, -14]
        System.out.println(Arrays.toString(bytes));

        //解码

//        String ss = new String(bytes);//煤球
//        System.out.println(ss);

//        String ss = new String(bytes, "UTF-8");//煤球
//        System.out.println(ss);

        String ss = new String(bytes, "GBK");
        System.out.println(ss);
    }
}
