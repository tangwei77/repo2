package Demo07;

public class Cat extends Animal {

    private String brand;

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
        System.out.println("猫的年龄是："+age+"，猫的颜色是:"+color);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫逮老鼠");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
