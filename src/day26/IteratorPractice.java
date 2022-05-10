package day26;

import day19.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("panjabi", 1000, LocalDate.now()));
        employees.add(new Employee("rahul", 2000, LocalDate.now()));
        employees.add(new Employee("prajesh", 2100, LocalDate.now()));

        boolean isEmployeeInTheList = employees.contains(new Employee("panjabi",1000,LocalDate.now()));
        System.out.println(isEmployeeInTheList);
       employees.toArray();


       /* for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(employee);
        }

        for (Employee employee : employees) {
        }*/
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            Logger.getGlobal().info(employee.toString());
        }


    }
}