package cn.itcast;

public class Manager {
    private String name;
    private int id;
    private double salsry;
    private double bonus;

    public Manager() {
    }

    public Manager(String name, int id, double salsry, double bonus) {
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
        System.out.println("姓名为"+this.name+"工号为"+this.id+"基本工资为"+this.salsry+"奖金为"+this.bonus+"的项目经理正在努力的作者管理工作，分配任务，检查员工提交上来的代码");
    }
}
