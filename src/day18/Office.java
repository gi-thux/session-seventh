package day18;

import java.time.LocalDate;

public class Office {

    public static void main(String[] args) {
        Employee employee1 = new Employee("kamal",5000, LocalDate.now());
        Employee employee2 = new Employee("kamal",5000, LocalDate.now());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        boolean isEqual= employee1 == employee2;
        boolean isEqual1= employee1.equals(employee2);

        System.out.println(isEqual);

        System.out.println(isEqual1);



        }


}
