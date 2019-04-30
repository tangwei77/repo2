package cn.itcast;

public class Demo02 {
    public static void main(String[] args) {
        String string="adsfgds";
        System.out.println(string.length());

        char c = string.charAt(3);
        System.out.println("字符串中3号索引对应的字符是"+c); //f

        int fg = string.indexOf("fg");
        System.out.println("fg在字符串中首次出现的位置是"+fg);
    }
}
