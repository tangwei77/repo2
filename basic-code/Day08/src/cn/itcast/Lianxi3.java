package cn.itcast;

public class Lianxi3 {
    public static void main(String[] args) {
        Phone phone=new Phone("苹果",8500.0);
        Phone.size=6;
        phone.call("唐伟");
        phone.sendMessage();
        System.out.println("手机品牌："+phone.getBrand()+",手机价格："+phone.getPrice()+",手机尺寸："+ Phone.size);
    }
}
