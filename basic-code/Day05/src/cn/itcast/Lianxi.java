package cn.itcast;

public class Lianxi {
    public static void main(String[] args) {
        int[] score={80,90,50,85,90,78,88,89,93,98,75,59};
        int num=0;
        int avg=0;
        int sum=0;
        for (int i = 0; i < score.length; i++) {
            if(score[i]<60){
                num++;
            }
            sum+=score[i];
        }
        avg=sum/score.length;
        System.out.println("不及格人数："+num+",平均分："+avg+"，总分："+sum);
    }
}
