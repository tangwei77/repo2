package cn.itcast;

import java.util.Scanner;

public class Gaoji2 {
    public static void main(String[] args) {
        boolean same = isSame();
        System.out.println("这个QQ号码是否正确：" + same);
    }

    public static boolean isSame() {
        System.out.println("请输入QQ号：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (str.length() < 5 || str.length() > 12) {
                return false;
            } else if (chars[0] == 0) {
                return false;
            } else if (chars[i] < '0' || chars[i] > '9') {
                return false;
            } else {
                return true;
            }
        }
        return isSame();
    }
}

