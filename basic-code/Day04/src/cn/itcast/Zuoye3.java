package cn.itcast;

public class Zuoye3 {
    public static void main(String[] args) {
        int sum=method(100);
        System.out.println(sum);
        System.out.println(method(100));
    }
    public static int method(int a){
        int b=0;
        for (int i = 0; i <= a; i++) {
            if(i%2==0){
                b+=i;
            }
        }
        return b;
    }
}
