package Day10;

public class Keyboard implements USB {
    @Override
    public void powerOn() {
        System.out.println("连接键盘的USB");
    }

    @Override
    public void powerOff() {
        System.out.println("断开键盘的USB");
    }
}
