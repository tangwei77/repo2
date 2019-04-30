package cn.itcast;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuozhan1 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        String str2="";
        for (int i = ch.length - 1; i >= 0; i--) {
            str2+=ch[i];
        }
        System.out.println(str);
        System.out.println("录入的字符串："+str);
        System.out.println("反转的字符串："+str2);
    }





}
