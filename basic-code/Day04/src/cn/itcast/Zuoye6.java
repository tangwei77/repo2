package cn.itcast;

public class Zuoye6 {
    public static void main(String[] args) {
        System.out.println(Method(100));
    }
    public static int Method(int a){
        int sum=0;
        for (int i = 0; i <= a; i++) {
            if(i%2!=0){
                continue;
            }
            sum+=i;
        }
        return sum;
    }
}
