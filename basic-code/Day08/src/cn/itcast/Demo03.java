package cn.itcast;

public class Demo03 {
    public static void main(String[] args) {
        String str1="Hello World";
        String substring = str1.substring(3);
        System.out.println(substring); //lo World

        String substring1 = str1.substring(6, 8);
        System.out.println(substring1); // Wo
    }
}
