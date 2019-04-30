package cn.itcast;

public class gaoji2 {
    public static void main(String[] args) {
        System.out.println(doCheck(2));
        System.out.println(doCheck(3));
    }

    public static boolean doCheck(int num) {
        boolean flag;
        if (num % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                num -= i;
            }
            flag = true;
        } else {
            for (int i = 0; i <= 20; i++) {
                num += i;
            }
            flag = false;
        }
        System.out.println("num:" + num);
        return flag;
    }
}