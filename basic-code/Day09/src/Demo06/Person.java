package Demo06;

public abstract class Person {
    private String name;
    private int id;
    private double slary;

    public abstract void work();

    public void show(String name,int id){
        System.out.println("我叫："+name+"，我的工号是："+id);
    }

    public Person() {
    }

    public Person(String name, int id, double slary) {
        this.name = name;
        this.id = id;
        this.slary = slary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSlary() {
        return slary;
    }

    public void setSlary(double slary) {
        this.slary = slary;
    }
}
