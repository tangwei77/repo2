package cn.itcast;

import java.util.Scanner;

public class Tuozhan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入QQ号：");
        String str=sc.next();
        boolean aTrue = isTrue(str);
        System.out.println("这个QQ号码是否正确："+aTrue);
    }

    public static boolean isTrue(String str) {
        char[] ch = str.toCharArray();
        if (str.length() < 5 || str.length() > 12) {
            return false;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[0] == '0') {
                return false;
            }
            if (ch[i] < '0' || ch[i] > '9') {
                return false;
            }
        }
        return true;
    }
}