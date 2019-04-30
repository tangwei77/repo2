package Demo02;

public class Computer {
    public void run(){
        System.out.println("笔记本运行");
    }

    public void useUsb(USB usb){
        if(usb != null){
           usb.open();

           if(usb instanceof Mouse){
               Mouse mouse=(Mouse) usb;
               mouse.click();
           }else if(usb instanceof Keyboard){
               Keyboard k=(Keyboard) usb;
               k.type();
           }
           usb.close();
        }
    }

    public void shutDown(){
        System.out.println("笔记本关闭");
    }
}
