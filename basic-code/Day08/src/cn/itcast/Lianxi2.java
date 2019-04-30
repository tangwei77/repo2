package cn.itcast;

import java.util.Arrays;
import java.util.Scanner;

public class Lianxi2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strbig = sc.next();
        String strsmall = sc.next();
       int count=0;
       while(true){
           int heima = strbig.indexOf("heima");
           if(heima!=-1){
               count++;
               strbig=strbig.substring((heima+"heima").length());
           }else{
               break;
           }
       }
        System.out.println("出现了"+count+"次");
    }
}
