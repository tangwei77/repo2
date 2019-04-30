package cn.itcast;

public class cat1 {
    public static void main(String[] args) {
        Cat cat=new Cat(5,'黑');
        Cat cat1=new Cat(5,'白');
        cat.showMsg();
        cat1.showMsg();
        cat.isSame(cat.age,cat1.age,cat.color,cat1.color);
        System.out.println("************************");

        Cat cat2=new Cat(3,'黄');
        Cat cat3=new Cat(3,'黄');
        cat2.showMsg();
        cat3.showMsg();
        cat.isSame(cat2.age,cat3.age,cat2.color,cat3.color);
    }
}

