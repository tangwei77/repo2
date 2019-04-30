package cn.itcast;

public class Tuozhan7 {
    public static void main(String[] args) {
        char[] arr={'a','l','m','f','o','b','b','s','n'};
        printCount(arr);
    }

    public static void printCount(char[] arr){
        int[] count=new int[26];
        for (int i = 0; i < arr.length; i++) {
            int c=arr[i];
            count[c-97]++;
        }
        for (int i = 0,ch=97; i < count.length; i++,ch++) {
            if(count[i] != 0){
                System.out.println((char)ch+"--"+count[i]);
            }
        }
    }
}
