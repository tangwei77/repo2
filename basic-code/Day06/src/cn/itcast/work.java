package cn.itcast;

public class work {
    public static void main(String[] args) {
        Manager man=new Manager("唐伟",123,15000,6000);
        Coder cod=new Coder(135,1000);
        man.work();
        cod.work();
    }
}
