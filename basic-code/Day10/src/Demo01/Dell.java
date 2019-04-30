package Demo01;

public class Dell implements Usb {

    @Override
    public void show() {
        System.out.println("早上好");
    }

    @Override
    public void run() {
        System.out.println("不想吃早饭");
    }
}
