package day15;

public sealed class Manager extends Employee permits Executive {

    float bonus;

    public Manager(String name, int age, float salary, float bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public float getSalary() {
        float salary = bonus + super.getSalary();
        return salary;
    }
    public float getBonus(){
        return bonus;
    }

    public void fireEmployee(Employee employee) {
        System.out.println(employee+ " "+"employee is fired");
    }
}