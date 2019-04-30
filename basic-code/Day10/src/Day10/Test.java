package Day10;

public class Test {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.powerOn();

        Mouse m=new Mouse();
        laptop.useUSB(m);

        Keyboard k=new Keyboard();
        laptop.useUSB(k);

        laptop.powerOff();
    }
}
