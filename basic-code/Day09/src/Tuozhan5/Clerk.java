package Tuozhan5;

public class Clerk extends Employee{
    private Manager manager;

    public Clerk() {
    }

    public Clerk(String name, String id, String branch) {
        super(name, id, branch);
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void showMsg(){
        super.show();
        System.out.println("他的经理是"+manager.getName());
    }
}
