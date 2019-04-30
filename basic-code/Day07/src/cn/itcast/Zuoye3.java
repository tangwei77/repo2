package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Random r=new Random();
        int a=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true){
            int b=sc.nextInt();
            if(b>a){
                System.out.println("太大了");
            }else if(b<a){
                System.out.println("太小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
