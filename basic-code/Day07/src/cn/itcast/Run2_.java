package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class Run2_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            int a=sc.nextInt();
            int b=r.nextInt(100)+1;
            if(a>b){
                System.out.println("太大了");
            }else if(a<b){
                System.out.println("太小了");
            }else{
                System.out.println("猜对了");
            }
        }
        System.out.println("你没机会了");
    }
}
