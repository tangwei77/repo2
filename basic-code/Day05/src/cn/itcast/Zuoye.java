package cn.itcast;

public class Zuoye {
    public static void main(String[] args) {
        int[] arr={80,90,50,85,90,78,88,89,93,98,75,59};
        int num=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<60){
                num++;
            }
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        System.out.println(num);
        System.out.println(avg);
        System.out.println(sum);
    }
}
