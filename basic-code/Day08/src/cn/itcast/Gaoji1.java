package cn.itcast;

import java.util.Scanner;

public class Gaoji1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        System.out.println("录入的字符串："+str);
        char[] chars = str.toCharArray();
        String str1="";
        for (int i = chars.length - 1; i >= 0; i--) {
            str1+=chars[i];
        }
        System.out.println("反转的字符串："+str1);
    }
}
