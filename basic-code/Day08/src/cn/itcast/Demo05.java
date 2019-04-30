package cn.itcast;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        String str="我,是,你,霸,霸";
        String[] split = str.split(",");
        System.out.println(Arrays.toString(split));

        String str1="Hollo World";
        String o = str1.replace("o", "*");
        System.out.println(o);

        String str2="hello world";
        String replace = str2.replace("he","HE");
        System.out.println(replace);
    }
}

