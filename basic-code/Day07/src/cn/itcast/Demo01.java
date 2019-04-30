package cn.itcast;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int num1=sc.nextInt();
        System.out.println("请输入第二个数据:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("数据和为："+sum);
        System.out.println("请输入第三个数据:");
        int num3=sc.nextInt();
        int max=num1>num2?num1:num2;
        max=max>num3?max:num3;
        System.out.println("最大值是："+max);*/

        show(new Scanner(System.in));
    }

    public static void  show(Scanner sc) {

        System.out.println( sc.nextInt());
    }
}
