package Lianxi6;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("张小强", "M001", "销售部");
        Clerk clerk = new Clerk("李小亮", "C001", "销售部");
        manager.setClerk(clerk);
        manager.manager();

        clerk.setManager(manager);
        clerk.clerk();

    }
}
