package day8;

import java.util.Calendar;
import java.util.Objects;

public class WorkingWithNull {
    public static void main(String[] args) {
        /*String name = null;
        name.equals("abc");
        System.out.println(name);*/

        Employee employee = new Employee( "amitab bachan",1,12,Calendar.getInstance(),"it");
        String abc= Objects.requireNonNullElse(employee.getName(),"N/A");
        String ab=abc.toUpperCase();
        System.out.println(ab);

        Calendar hireDate = Objects.requireNonNullElse(employee.getHireDate(), Calendar.getInstance());
        String sHireDate= hireDate.toString();
        System.out.println(sHireDate );

}}
