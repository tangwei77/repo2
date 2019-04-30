package cn.itcast;

import java.util.Scanner;

public class Tuozhan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入大字符串：");
        String strbig=sc.next();
        System.out.println("请输入小字符串：");
        String strsmall=sc.next();

        String replace = strbig.replace(strsmall, "");
        int a=strbig.length()-strsmall.length();
        int num=a/strsmall.length();
        System.out.println("小字符串"+strsmall+",在大字符串中共出现"+num+"次");
    }
}
