package cn.itcast;

public class day5Gaoji2 {
    public static void main(String[] args) {
        int[] arr={95,92,75,56,98,71,80,58,91,91};
        getAvg(arr);
    }
    public static void getAvg(int[] arr){
        int sum=0;
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg){
                num++;
            }
        }
        System.out.println("高于平均分："+avg+"的个数有"+num+"个");
    }

}
