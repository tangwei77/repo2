package cn.itcast;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if(ch>='A' && ch<='Z'){
                count1++;
            }else if(ch>='a' && ch<='z'){
                count2++;
            }else if(ch>='0' && ch<='9'){
                count3++;
            }else{
                count4++;
            }
        }
        System.out.println("大写字母有："+count1);
        System.out.println("小写字母有："+count2);
        System.out.println("数字有："+count3);
        System.out.println("其他字母有："+count4);
    }

}
