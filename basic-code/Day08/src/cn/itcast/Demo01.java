package cn.itcast;

public class Demo01 {
    public static void main(String[] args) {
        String str1="Hello";
        char[] arr={'H','e','l','l','o'};
        String str2=new String(arr);
        boolean equals = str1.equals(str2);
        System.out.println(equals);

        String str4="hello";
        boolean equals1 = str1.equals(str4);
        System.out.println(equals1);
        boolean b = str1.equalsIgnoreCase(str4);
        System.out.println(b);
    }
}
