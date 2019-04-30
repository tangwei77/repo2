package cn.itcast;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaoji6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        int a = sc.nextInt();
        System.out.println("请输入运算符");
        String str = sc.next();
        System.out.println("请输入数字");
        int b = sc.nextInt();
        String count=count(a,str,b);
        System.out.println(a+str+b+"="+count);
    }
    public static String count(int a,String str,int b){
        int r=0;
        if("+".equals(str)){
            r=a+b;
        }else if("-".equals(str)){
            r=a-b;
        }else if("*".equals(str)){
            r=a*b;
        }else if("/".equals(str)){
            r=a/b;
        }else if("%".equals(str)){
            r=a%b;
        }else{
            return null;
        }
        return r+"";
    }
}
