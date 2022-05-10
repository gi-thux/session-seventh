package day19;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
   private int salary;
    private LocalDate hireDate;


    public Employee(String name, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && name.equals(employee.name) && hireDate.equals(employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDate);
    }
}
