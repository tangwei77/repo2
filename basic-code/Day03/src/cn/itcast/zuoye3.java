package cn.itcast;

public class zuoye3 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0 && i%5==0){
                continue;
            }
            System.out.print(i+"\t");
            count++;
            if(count%6==0){
                System.out.println();
            }
        }
    }
}
