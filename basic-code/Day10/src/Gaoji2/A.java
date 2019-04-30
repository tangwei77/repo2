package Gaoji2;

public interface A {
    public abstract void shoeA();

    public default void showB(){
        System.out.println("BBBB");
    }
}
