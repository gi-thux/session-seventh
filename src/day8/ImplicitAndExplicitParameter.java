package day8;

import java.util.Calendar;

public class ImplicitAndExplicitParameter {
    public static void main(String[] args) {
        Employee basant = new Employee("tamen",40,500000, Calendar.getInstance(),"IT");

        Employee kamal= new Employee("kamal",35,400000,Calendar.getInstance(),"HR");
        System.out.println(kamal.getName() + " "+"salary is"+" " +kamal.getSalary());

        basant.fireEmployee(basant);
        kamal.fireEmployee();


kamal.setEmployeeCount(21);


        System.out.println("the employee count is" +" " + basant.getEmployeeCount());
    }


}
