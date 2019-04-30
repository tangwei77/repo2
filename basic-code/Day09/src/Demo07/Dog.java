package Demo07;

public class Dog extends Animal{

    private String brand;

    public Dog() {

    }

    public Dog(int age, String color) {
        super(age, color);
        System.out.println("狗的年龄是："+age+"，狗的颜色是:"+color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗吃"+something);
    }

    public void lookHome(){
        System.out.println("狗看家");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
