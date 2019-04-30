package cn.itcast;

public class day05zuoye03 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(max<arr[i]){
               max=arr[i];
           }
        }
        System.out.println(max);
    }
}
