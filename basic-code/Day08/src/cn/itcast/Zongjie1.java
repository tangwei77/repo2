package cn.itcast;

import java.util.Arrays;

public class Zongjie1 {
    public static void main(String[] args) {
        String str="";
        char[] arr={'a','b','c'};
        String str1=new String(arr);
        byte[] arr1={97,98,99};
        String str2=new String(arr1);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        String str3="abc";
        System.out.println(str1.equals(str3));

        String str4="10!20!30!40!";
        String str5="10.20.30.40";
        String[] split = str4.split("!");
        String[] split1 = str5.split("\\.");
        System.out.println(split);
        System.out.println(Arrays.toString(split));
        System.out.println(Arrays.toString(split1));
    }
}
