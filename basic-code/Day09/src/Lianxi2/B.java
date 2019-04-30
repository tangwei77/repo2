package Lianxi2;

public abstract class B extends A {
    int numb1=20;

    public B() {
    }

    public B(int numb1) {
        this.numb1 = numb1;
    }

    public int getNumb1() {
        return numb1;
    }

    public void setNumb1(int numb1) {
        this.numb1 = numb1;
    }

    public abstract void showB();
}
