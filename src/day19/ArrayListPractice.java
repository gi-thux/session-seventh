package day19;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListPractice  {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.ensureCapacity(100);
        arr.add("aman");
        arr.add("vicky");
        System.out.println(arr.toString());

        arr.add(0, "taman");
        System.out.println(arr.toString());

        arr.set(1, "biren");
        System.out.println(arr.toString());

        arr.remove(1);
        System.out.println(arr.toString());


        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee("a", 100, LocalDate.now()));
        employee.add(new Employee("ABC", 2000, LocalDate.now()));
        employee.add(new Employee("DEF", 5000, LocalDate.now()));
        employee.add(new Employee("IJK", 5000, LocalDate.now()));
        employee.add(new Employee("LMN", 5000, LocalDate.now()));

        System.out.println(employee);

        ArrayList<String> abc = new ArrayList<>();
        abc.add("sun");
        abc.add("1");
        abc.remove(0);
        System.out.println(abc);

        System.out.println(employee.get(2));
        employee.remove(new Employee("ABC", 2000, LocalDate.now()));

      ArrayList<Employee> employeesToBeRemoved = new ArrayList<>();
        employeesToBeRemoved.add(new Employee("DEF", 5000, LocalDate.now()));
        employeesToBeRemoved.add(new Employee("LMN", 5000, LocalDate.now()));
       // employee.removeAll(employeesToBeRemoved);
         System.out.println(employeesToBeRemoved);



       System.out.println(employee.isEmpty());

      employee.clear();

        System.out.println(employee.isEmpty());


    }

}