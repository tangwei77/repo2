package cn.itcast;

import java.util.Scanner;

public class Zuoye2_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strbig=sc.next();
        String strsmall=sc.next();
        String replace = strbig.replace(strsmall, "");
        int a=strbig.length()-replace.length();
        int count=a/strsmall.length();
        System.out.println("共出现"+count+"次");
    }
}
