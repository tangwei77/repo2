package Gaoji7_;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double salary, double bankcard, double bonus) {
        super(name, salary, bankcard);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
