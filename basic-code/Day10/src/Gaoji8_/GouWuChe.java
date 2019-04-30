package Gaoji8_;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods>list=new ArrayList<>();

    public void add(Goods goods){
            System.out.println("加入 "+goods.getName()+" 成功");
            list.add(goods);

    }

    public void show(Goods goods){
        System.out.println("您选购的商品为：");
        for (int i = 0; i < list.size(); i++) {
            Goods good=list.get(i);
            good.show();
        }
    }

    public void total(){
        double off=0; //折后价
        double sum=0; // 原价
        for (int i = 0; i < list.size(); i++) {
            Goods goods=list.get(i);
            double price=goods.getPrice();
            sum+=price;


            if(goods instanceof Egoods){
                price*=0.88;
            }
            off+=price;
        }
        System.out.println("---------------------");
        System.out.println("原 价为："+sum);
        System.out.println("折后价为："+off);
    }

}
