package cn.itcast;

import java.util.Scanner;

public class Tuozhan4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        System.out.println(str);
        String[] arr={"奥巴马","普京"};
        for (int i = 0; i < arr.length; i++) {
            str=str.replace(arr[i],"*");
        }
        System.out.println(str);
    }
}
