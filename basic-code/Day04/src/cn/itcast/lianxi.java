package cn.itcast;

public class lianxi {
    public static void main(String[] args) {
       // System.out.println(add(6));
        boolean a=add(5);
        System.out.println(a);
    }
    public static boolean add(int i){
       /* if(i%3==0){
            return true;
        }else{
            return false;
        }*/
       return i%3==0;
    }
}
