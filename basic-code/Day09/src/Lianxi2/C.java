package Lianxi2;

public class C extends B{

    int numc=30;

    @Override
    public void showA() {
        System.out.println("A类中numa："+getNuma());
    }

    @Override
    public void showB() {
        System.out.println("B类中numb："+getNumb1());
    }

    public void showC(){
        System.out.println("C类中numc："+numc);
    }
}
