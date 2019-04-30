package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int a=r.nextInt(100)+1;
        while(true){
            int b=sc.nextInt();
            if(b>a){
                System.out.println("太大了");
            }else if(b<a){
                System.out.println("太小了");
            }else{
                System.out.println("猜对了");
            }
        }
    }
}
