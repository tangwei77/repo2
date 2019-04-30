package cn.itcast;
// 第一题
/*
public class Zuoye02 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
*/

/*
public class Zuoye02 {
    public static void main(String[] args) {
        System.out.println(sum( 100 ));
    }
    public static int sum(int n){
        int add =0;
        for (int i = 1; i <= n; i++) {
            add +=i;
        }
        return add;
    }
}

*/

/*
public class Zuoye02 {
    public static void main(String[] args) {
        System.out.println(sum( 1,10));
    }
    public static int sum(int x,int y){
        int add =0;
        for (int i = x; i <= y; i++) {
            add +=i;
        }
        return add;
    }
}
*/

/*public class Zuoye02 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 100; i++) {
            if(i%3==0){
                continue;
            }
            System.out.print(i+"\t");
            count++;
            if(count%6==0){
                System.out.println();
            }
        }



    }
}*/

/*public class Zuoye02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+"\t");
            }
                System.out.println();
            }
        }
    }*/

public class Zuoye02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}





