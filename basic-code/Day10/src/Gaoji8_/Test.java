package Gaoji8_;

public class Test {
    public static void main(String[] args) {
        Goods A=new Goods("笔记本","g10000",10000.0);
        Goods B=new Goods("手机","g10001",5000.0);
        Goods C=new Goods("苹果","g20000",50.0);

        System.out.println("===========添加商品============");
        GouWuChe g=new GouWuChe();
        g.add(A);
        g.add(B);
        g.add(C);

        System.out.println("=============打印商品=============");
        g.show(A);
        g.show(B);
        g.show(C);

        System.out.println("------------------");
        g.total();
    }
}
