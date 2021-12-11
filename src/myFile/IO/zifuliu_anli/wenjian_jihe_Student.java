package myFile.IO.zifuliu_anli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class wenjian_jihe_Student {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\文件到集合Student.txt"));

        ArrayList<Student> array = new ArrayList<Student>();

        String line;
        while((line = br.readLine()) != null){
            String[] ss = line.split(",");

//            Student s = new Student();
//            s.setBianhao(ss[0]);
//            s.setName(ss[1]);
//            s.setAge(Integer.parseInt(ss[2]));
//            s.setDizhi(ss[3]);

            Student s = new Student(ss[0], ss[1], Integer.parseInt(ss[2]), ss[3]);


            array.add(s);
        }

        for(Student s : array){
            System.out.println(s.getBianhao());
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getDizhi());
        }

        br.close();
    }
}
