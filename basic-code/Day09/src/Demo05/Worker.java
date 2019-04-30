package Demo05;

public class Worker extends Person {
    private String unit;
    private int workAge;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work(){
        System.out.println("工人的工作是盖房子");
    }
}


