package Day10;

public class Laptop {
    private USB usb;
    public void powerOn(){
        System.out.println("开机");
    }

    public void powerOff(){
        System.out.println("关机");
    }

    public void useUSB(USB usb){
        usb.powerOn();
       if(usb instanceof Mouse){
           Mouse m=new Mouse();
       }
       if(usb instanceof  Keyboard){
           Keyboard k=new Keyboard();
       }
       usb.powerOff();
    }
}
