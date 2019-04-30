package cn.itcast;

public class Tuozhan2 {
    public static void main(String[] args) {
        int[] arr={95,92,75,56,98,71,80,58,91,91};
        getAvg(arr);

    }
    public static void getAvg(int[] arr){
        int num=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            num+=arr[i];
            if(arr[i]>80){
                count++;
            }
        }
        int avg=num / arr.length;
        System.out.println("高于平均分："+avg+"的"+"个数有"+count+"个");
    }
}
