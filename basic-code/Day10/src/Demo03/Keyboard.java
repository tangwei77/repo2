package Demo03;

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("连接键盘的USB");
    }

    @Override
    public void close() {
        System.out.println("连接键盘的USB");
    }


}
