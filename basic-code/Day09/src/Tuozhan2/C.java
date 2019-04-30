package Tuozhan2;

import java.sql.SQLOutput;

public class C extends B {
    private int numc=30;

    @Override
    public void shoeA() {
        System.out.println("A类中numa:"+getNuma());
    }

    @Override
    public void showB() {
        System.out.println("B类中numb:"+getNumb1());
    }

    public void showC(){
        System.out.println("C类中numc:"+numc);
    }
}
