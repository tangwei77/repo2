package cn.itcast;

public class zuoye5 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i < 100; i++) {
            if(i%10==9 || i/9==10){
                continue;
            }
            System.out.print(i+"\t");
            a++;
            if(a%5==0){
                System.out.println();
            }

        }
    }
}
