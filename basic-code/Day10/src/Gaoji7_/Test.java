package Gaoji7_;

public class Test {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Manager m=new Manager("张小强",9000.0,0.0,500);
        Clerk c=new Clerk("李小亮",5000.0,0.0);
        m.show();
        c.show();
        for (int i = 1; i <= 3; i++) {
            Company company=new Company();

            System.out.println("============"+i+"月===============");
            company.salary(m);
            company.salary(c);
            m.show();
            c.show();
        }

    }
}
