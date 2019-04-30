package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class Zuoye3_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int b=r.nextInt(100)+1;
        int n=5;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if(a>b){
                System.out.println("太大了");
            }else if(a<b){
                System.out.println("太小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("没机会了");
    }

}
