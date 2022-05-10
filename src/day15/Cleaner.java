package day15;

public class Cleaner extends Employee {

    public Cleaner(String name,int age,float salary){
        super(name,age,salary);

    }
@Override
    public float getSalary(){
       float salary= super.getSalary();
        return salary;
    }
    }

