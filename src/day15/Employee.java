package day15;

public class Employee {
    private String name;
    private int age;
    private float salary;


    public float getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

}