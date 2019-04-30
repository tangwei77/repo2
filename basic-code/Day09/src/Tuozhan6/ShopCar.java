package Tuozhan6;

import java.util.ArrayList;

public class ShopCar {
    ArrayList<Goods> list=new ArrayList<>();

    public ShopCar() {
    }

    public ShopCar(ArrayList<Goods> list) {
        this.list = list;
    }

    public void add(Goods goods){
        list.add(goods);

    }

    public void showGoods(){
        System.out.println("您选购的商品为：");
        for (int i = 0; i < list.size(); i++) {
            Goods goods=list.get(i);
            goods.show();
        }
    }

    public void remove(Goods goods){
        list.remove(goods);
    }

    public void total(){
        double price=0;
        for (int i = 0; i < list.size(); i++) {
            Goods goods=list.get(i);
            price+=goods.getPrice();
        }
        System.out.println("总计："+price);
    }
}
