package Gaoji7;


public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("张小强", 9000.0, 0.0, 500.0);
        Clerk clerk = new Clerk("李小亮", 5000.0, 0.0);
        manager.show();
        clerk.show();
        Company company=new Company();
        for (int i = 1; i <= 3; i++) {
            System.out.println("==========="+i+"月==========");
            company.salary(manager);
            company.salary(clerk);
            manager.show();
            clerk.show();
        }

    }
}
