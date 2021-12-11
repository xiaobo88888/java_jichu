package myFile.IO.zifuliu_anli;

import java.io.*;
import java.util.ArrayList;

public class jihe_wenjian_Student {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("001", "刘博", 19, "吉安");
        Student s2 = new Student("002", "煤球", 20, "进贤");
        Student s3 = new Student("003", "高辉", 19, "***");

        array.add(s1);
        array.add(s2);
        array.add(s3);

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\集合到文件Student.txt"));

        for (Student s : array){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getBianhao()).append(',').append(s.getName()).append(',').append(s.getAge()).append(',').append(s.getDizhi());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
