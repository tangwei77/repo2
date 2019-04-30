package Tuozhan6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ShopCar shopCar=new ShopCar();
        Goods A=new Goods("电脑","g10000",6999.0);
        Goods B=new Goods("键盘","g10001",199.0);
        Goods C=new Goods("鼠标","g10002",59.0);

        shopCar.add(A);
        shopCar.add(B);
        shopCar.add(C);
        System.out.println("===========添加商品============");
        shopCar.showGoods();
        shopCar.total();

        System.out.println("==============移除鼠标==============");
        shopCar.remove(C);
        shopCar.showGoods();
        shopCar.total();

    }
}
