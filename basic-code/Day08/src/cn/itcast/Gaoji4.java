package cn.itcast;

import java.util.Scanner;

public class Gaoji4 {
    public static void main(String[] args) {
        String[] arr={"奥巴马","普京"};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        str.replace(arr[0],"*");
        for (int i = 0; i < arr.length; i++) {
            str=str.replace(arr[i],"*");
        }
        System.out.println(str);
    }
}
