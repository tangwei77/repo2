package cn.itcast;

import java.util.Scanner;

public class Gaoji3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入大字符串：");
        String strbig=sc.next();
        System.out.print("请输入小字符串：");
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
        System.out.println("小字符串"+strsmall+",在大字符串中共出现"+count+"次");
    }
}
