package Gaoji8;

public class Test {
    public static void main(String[] args) {
        ShopCar shopcar=new ShopCar();
        Goods A=new Laptop("笔记本","g10000",10000.0);
        Goods B=new Phone("手机","g10001",5000.0);
        Goods C=new Fruit("苹果","g20000",50.0);
        System.out.println("==========添加商品============");
        shopcar.add(A);
        shopcar.add(B);
        shopcar.add(C);

        System.out.println("===========打印商品============");
        shopcar.show();

        shopcar.total();
    }
}
