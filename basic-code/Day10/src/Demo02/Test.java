package Demo02;

public class Test {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.run();

        USB usb=new Mouse();
        c.useUsb(usb);

        c.useUsb(new Keyboard());

        c.shutDown();
    }
}
