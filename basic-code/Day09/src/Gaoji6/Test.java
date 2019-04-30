package Gaoji6;

public class Test {
    public static void main(String[] args) {
        Manager man=new Manager("唐伟","M001","销售部","李小亮");
        man.manager();

        Clerk clerk=new Clerk("李小亮","C001","销售部","唐伟");
        clerk.clerk();
    }
}
