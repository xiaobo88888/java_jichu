package myFile.IO.zifuliu_anli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class jihe_wenjian_paixu {
    public static void main(String[] args) throws IOException {
        //创建集合对象，按照总分从高到低排序
        TreeSet<Score> ts = new TreeSet<Score>(new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {
                int num = (int)s2.get() - (int)s1.get();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("请输入学生信息：");
            String s = in.nextLine();//键盘录入数据
            String[] ss = s.split(",");//将得到的数据按照,分隔成字符串数组

            Score sc = new Score(ss[0], Double.parseDouble(ss[1]), Double.parseDouble(ss[2]), Double.parseDouble(ss[3]));
            //创建Score对象
            ts.add(sc);//添加进集合
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_File\\集合到文件——排序.txt"));

        for (Score s : ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish());
            //拼接成字符串

            bw.write(sb.toString());//然后写入文件中
            bw.newLine();
            bw.flush();

        }
        bw.close();
    }
}
