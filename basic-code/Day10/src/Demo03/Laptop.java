package Demo03;

public class Laptop {

    public void powerOn(){
        System.out.println("开机");
    }

    public void powerOff(){
        System.out.println("关机");
    }

    public void useUSB(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse m=(Mouse) usb;

        }else if(usb instanceof Keyboard){
            Keyboard k=(Keyboard) usb;

        }
        usb.close();
    }


}
