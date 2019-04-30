package Gaoji7;

public class Test {
    public static void main(String[] args) {
        ShopCar car=new ShopCar();
        Goods A=new Goods("电脑","g10000",6999.0);
        Goods B=new Goods("键盘","g10001",199.0);
        Goods C=new Goods("鼠标","g10002",59.0);
        System.out.println("==================添加商品===============");
        car.add(A);
        car.add(B);
        car.add(C);
        car.showGoods();

        car.price();
        System.out.println("================移除鼠标=================");
        car.remove(C);
        car.showGoods();
        car.price();
    }
}
