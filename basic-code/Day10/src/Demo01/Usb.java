package Demo01;

public interface Usb {
    public abstract void show();

    public default void run(){
        System.out.println("吃饭了吗");
    }
}
