package cn.itcast;

import java.util.Scanner;

public class Tuozhan6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=sc.nextInt();
        System.out.println("请输入运算符");
        String str=sc.next();
        System.out.println("请输入第二个数");
        int b=sc.nextInt();

        int sum=0;
        if("+".equals(str)){
            sum=a+b;
            System.out.println(a+str+b+"="+(a+b));
        }else if("-".equals(str)){
            sum=a-b;
            System.out.println(a+str+b+"="+(a-b));
        }else if("*".equals(str)){
            sum=a*b;
            System.out.println(a+str+b+"="+(a*b));
        }else if("/".equals(str)){
            sum=a/b;
            System.out.println(a+str+b+"="+(a/b));
        }else if("%".equals(str)){
            sum=a%b;
            System.out.println(a+str+b+"="+(a%b));
        }else{
            System.out.println("");
        }

    }
}
