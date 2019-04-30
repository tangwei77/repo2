package Tuozhan2;

public abstract class B extends A {

    private int numb1=20;

    public abstract void showB();

    public B() {
    }

    public B(int numa, int numb1) {
        super(numa);
        this.numb1 = numb1;
    }

    public int getNumb1() {
        return numb1;
    }

    public void setNumb1(int numb1) {
        this.numb1 = numb1;
    }
}
