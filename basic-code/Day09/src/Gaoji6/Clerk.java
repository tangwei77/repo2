package Gaoji6;

public class Clerk extends Employee{

    private String manager;

    public Clerk(String manager) {
        this.manager = manager;
    }

    public Clerk(String name, String id, String bumen, String manager) {
        super(name, id, bumen);
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void clerk() {
        System.out.println(super.getBumen() + "的：" + super.getName() + "，员工编号:" + super.getId());
        System.out.println("他的经理是" +this.manager);
    }
}

