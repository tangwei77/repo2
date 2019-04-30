package Gaoji7;

public class Company implements Money{
    @Override
    public void salary(Employee emp) {
        emp.setBankcard(emp.getBankcard()+emp.getSalary());
        if(emp instanceof Manager){
            Manager m=(Manager) emp;
            double bounds =m.getBonus();
            m.setBankcard(m.getBankcard()+bounds);
        }
    }
}
