package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class DemoRandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        Scanner sc = new Scanner(System.in);
        int n=2;
        int count=0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > num) {
                System.out.println("太大了");
            } else if (a < num) {
                System.out.println("太小了");
            } else {
                System.out.println("猜中了");
                break;
            }
            count++;
            if(count==n){
                System.out.println("没有机会了");
        }
        }
    }
}