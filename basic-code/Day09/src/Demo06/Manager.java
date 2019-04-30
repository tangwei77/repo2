package Demo06;

public class Manager extends Person {

    private double bonus;

    @Override
    public void work() {
        System.out.println("我的工作是分配任务");
    }

    public Manager() {
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
