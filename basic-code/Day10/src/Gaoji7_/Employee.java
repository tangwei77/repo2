package Gaoji7_;

public class Employee {
    private String name;
    private double salary;
    private double bankcard;

    public Employee() {
    }

    public Employee(String name, double salary, double bankcard) {
        this.name = name;
        this.salary = salary;
        this.bankcard = bankcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBankcard() {
        return bankcard;
    }

    public void setBankcard(double bankcard) {
        this.bankcard = bankcard;
    }

    public void show(){
        System.out.println(name+"的薪资为："+salary+"      卡余额是："+bankcard);
    }
}
