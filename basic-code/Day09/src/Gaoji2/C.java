package Gaoji2;

public class C extends B {

    private int numc;

    @Override
    public void showA(int numa) {
        System.out.println("A类中numa："+numa);
    }

    @Override
    public void showB(int numb1) {
        System.out.println("B类中numb："+numb1);
    }

    public void showC(int numc){
        System.out.println("C类中showC："+numc);
    }
}
