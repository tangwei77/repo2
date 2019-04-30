package cn.itcast;

public class Zongjie2 {
    public static void main(String[] args) {
        String str="asdggfbddsf";
        int length = str.length();
        System.out.println(length);

        char c = str.charAt(2);
        System.out.println(c); //d

        int dgg = str.indexOf("dgg");
        System.out.println(dgg); //2

        String substring = str.substring(3, 7);
        System.out.println(substring);

        char[] chars = str.toCharArray();
        System.out.println(chars);

        String replace = str.replace("gg", "GG");
        System.out.println(replace);
    }
}
