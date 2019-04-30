package Kaoshi;

public class SuperMan extends Person {
    public SuperMan() {
    }

    public SuperMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+"的超人到此一游");
    }

    private void fly(){
        System.out.println(super.getName()+"飞飞飞");
    }

    public void go(){
        fly();
    }


}
