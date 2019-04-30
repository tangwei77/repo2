package cn.itcast;

import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strbig=sc.next();
        String strsmall=sc.next();
        String s = strbig.replace(strsmall, "");
        int a=strbig.length()-s.length();
        int b=a/strsmall.length();
        System.out.println("共出现："+b+"次");
    }
}
