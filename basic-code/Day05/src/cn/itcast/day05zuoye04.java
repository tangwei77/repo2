package cn.itcast;

public class day05zuoye04 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
           if (min>arr[i]){
               min=arr[i];
            }
        }
        System.out.println(min);
    }
}