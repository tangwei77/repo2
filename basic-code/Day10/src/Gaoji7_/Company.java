package Gaoji7_;

public class Company implements Money {

    @Override
    public void salary(Employee emp) {
        emp.setBankcard(emp.getSalary()+emp.getBankcard());
        if(emp instanceof Manager){
            Manager m=(Manager) emp;
            emp.setBankcard(emp.getBankcard()+m.getBonus());
        }
    }
}
