package Gaoji7;

import java.util.ArrayList;

public class ShopCar {
     ArrayList<Goods> list=new ArrayList<>();

    public ShopCar() {

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

    public void price(){
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            Goods goods=list.get(i);
            sum+=goods.getPrice();
        }
        System.out.println("总计:"+sum+"元");
    }
}
