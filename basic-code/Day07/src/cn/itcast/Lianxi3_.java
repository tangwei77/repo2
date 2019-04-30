package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class Lianxi3_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int a=r.nextInt(100)+1;
        for (int i = 0; i < 5; i++) {
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
        System.out.println("没有机会了");
    }
}
