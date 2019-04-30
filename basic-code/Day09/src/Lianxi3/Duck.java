package Lianxi3;

public class Duck extends Poultry {

    public Duck() {
    }

    public Duck(String name, String symptom, int age, String liiness) {
        super(name, symptom, age, liiness);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状为："+getSymptom());
    }
}
