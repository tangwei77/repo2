package Demo04;

public abstract class Animal {
    private int age;
    private Animal eat;
    private String name;

    public void drink() {
        System.out.println("喝水");
    }

    public abstract void eat();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getEat() {
        return eat;
    }

    public void setEat(Animal eat) {
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}