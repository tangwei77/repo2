package Animal;

public abstract class Animal {
    private int age;
    private String colorl;

    public abstract void eat(String something);

    public Animal() {
    }

    public Animal(int age, String colorl) {
        this.age = age;
        this.colorl = colorl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorl() {
        return colorl;
    }

    public void setColorl(String colorl) {
        this.colorl = colorl;
    }
}
