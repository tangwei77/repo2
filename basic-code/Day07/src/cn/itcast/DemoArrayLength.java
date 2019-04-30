package cn.itcast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DemoArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int a = r.nextInt(100) + 1;
            arr[i] = a;
            }
        int max=arr[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println("数组中最大数字为："+max);
        double avg=sum/arr.length;
        System.out.println("数组中数字平均值为："+avg);
    }
}
