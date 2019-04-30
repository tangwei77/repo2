package cn.itcast;

public class day05zuoye {
    public static void main(String[] args) {
        int[] score={80,90,50,85,90,78,88,89,93,98,75,59};
        int num=0;
        int sum=0;
        for (int i = 0; i < score.length; i++) {
            if(score[i]<60){
                continue;
            }
            num=num+1;
            sum=score[i]+sum;
        }
        System.out.println(num);
        System.out.println(sum);
        int avg=sum/score.length;
        System.out.println(avg);
    }
}
