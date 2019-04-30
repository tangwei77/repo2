package cn.itcast;

public class gaoji1 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        printNum(a,b);
        doubling(a,b);
    }
    public static void printNum(int iVar1,int iVar2) {
        System.out.println("iVar1:"+iVar1+","+"iVar2:"+iVar2);
    }
    public static void  doubling(int r,int p) {
        r*=2;
        p*=2;
        System.out.println("翻倍："+"r="+r+","+"p="+p);
    }
}
