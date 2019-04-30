package cn.itcast;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc=getScanner();
        System.out.println(sc.nextInt());
    }
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
