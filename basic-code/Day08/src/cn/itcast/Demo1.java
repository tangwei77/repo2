package cn.itcast;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strbig=sc.next();
        String strsmall=sc.next();
        int count=0;
        while(true){
            int index=strbig.indexOf(strsmall);
            if(index!=-1){
                count++;
                strbig=strbig.substring(index+strsmall.length());
            }else{
                break;
            }
        }
        System.out.println("共出现"+count+"次");
    }
}
