package cn.itcast;

import java.util.Scanner;

public class Lianxi2_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strbig=sc.next();
        String strsmall=sc.next();
        char[] chars = strsmall.toCharArray();
        String replace = strbig.replace(strsmall, "");
        int a=strbig.length()-replace.length();
        int count=a/strsmall.length();
        System.out.println("出现了"+count+"次");
    }
}
