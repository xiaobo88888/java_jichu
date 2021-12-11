package myFile.IO.properties;

import java.util.Random;
import java.util.Scanner;

public class game {
    private game(){

    }
    public static void start(){
        Random rd = new Random();
        int number = rd.nextInt(100) + 1;

        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("请输入你猜的数字：");
            int i = in.nextInt();

            if(i < number){
                System.out.println("你猜的小了");
            }else if(i > number){
                System.out.println("你猜的大了");
            }else{
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
