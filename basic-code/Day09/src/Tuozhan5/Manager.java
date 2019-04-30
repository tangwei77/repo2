package Tuozhan5;

public class Manager extends Employee {
    private Clerk clerk;

    public Manager() {
    }

    public Manager(String name, String id, String branch) {
        super(name, id, branch);
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    public void showMsg(){
        super.show();
        System.out.println("他的职员是"+clerk.getName());
    }
}
