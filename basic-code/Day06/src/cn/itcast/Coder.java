package cn.itcast;

public class Coder {
    private String name;
    private int id;
    private double salsry;
    private double bonus;

    public Coder() {
    }

    public Coder(int id, double salsry) {
        this.name = name;
        this.id = id;
        this.salsry = salsry;
        this.bonus = bonus;
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

    public double getSalsry() {
        return salsry;
    }

    public void setSalsry(double salsry) {
        this.salsry = salsry;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("工号为"+this.id+"基本工资为"+this.salsry+"的程序员正在努力的写着代码");
    }
}
