package myFile.IO.zifuliu_anli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Random_dianmingqi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_File\\点名器.txt"));

        ArrayList<String> array = new ArrayList<String>();

        Random r = new Random();

        String line;
        while((line = br.readLine()) != null){
            array.add(line);
        }

        int i = r.nextInt(array.size()) ;


        System.out.println(array.get(i) + "被抽中了");

    }
}
