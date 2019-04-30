package cn.itcast;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strbig=sc.next();
        String strsmall=sc.next();
        int count=0;
        while(true){
            int i = strbig.indexOf(strsmall);
            if(i!=-1){
                count++;
            strbig = strbig.substring(i + strsmall.length());
            }else{
                break;
            }
        }
        System.out.println("共出现"+count+"次");
    }
}
