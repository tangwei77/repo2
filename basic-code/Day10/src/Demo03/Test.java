package Demo03;

public class Test {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.powerOn();

        USB m=new Mouse();
        l.useUSB(m);

        USB k=new Keyboard();
        l.useUSB(k);

        l.powerOff();
    }
}
