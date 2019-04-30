package cn.itcast;

public class zuoye6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1+"*"+i+"="+i*i1+"\t");
            }
            System.out.println();
        }
    }
}
