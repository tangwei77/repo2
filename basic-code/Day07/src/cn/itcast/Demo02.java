package cn.itcast;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        System.out.println("数据为："+a);
        if(a%2==0){
            System.out.println("数据为偶数");
        }else{
            System.out.println("数据为奇数");
        }
    }
}
