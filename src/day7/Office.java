package day7;

import java.util.Calendar;

public class Office {

    public static void main(String[] args) {

        Employee hari= new Employee("hari",21,19000,Calendar.getInstance() ,"IT");
        System.out.println("Employee Name "+ hari.getName());
        System.out.println("Employee Age " +hari.getAge());
        System.out.println("Employee Salary " +hari.getSalary());
        System.out.println("Employee HireDate "+hari.getHireDate());
        System.out.println("Employee Department " +hari.getDepartment());

        System.out.println("========================");


       Employee gita= new Employee("gita",25,20000,Calendar.getInstance(),"HR","123abc");

       /* System.out.println("Employee Name "+ gita.getName());
        System.out.println("Employee Age " +gita.getAge());
        System.out.println("Employee Salary " +gita.getSalary());
        set.hireset(Calendar.YEAR,1999);
        gita.set(Calendar.MONTH,10);
        gita.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(gita.getTime());
        System.out.println("Employee HireDate "+ Month.of(gita.getCalendar(Calendar.MONTH).name())+gita.getCalendar(Calendar.DAY_OF_MONTH)+ gita.getCalendar(Calendar.YEAR));
        System.out.println("Employee Department " +gita.getDepartment());*/

        System.out.println("========================*************************");

        Employee vicky= new Employee("vicky",28,100000,Calendar.getInstance(),"Finance","12345678");

        System.out.println("Employee Name "+ vicky.getName());
        System.out.println("Employee Age " +vicky.getAge());
        System.out.println("Employee Salary " +vicky.getSalary());
        System.out.println("Employee HireDate "+vicky.getHireDate());
        System.out.println("Employee Department " +vicky.getDepartment());

        System.out.println("========================*************************");

        Employee tenzing= new Employee("tenzing",22,10000,Calendar.getInstance(),"Transportation","123789");

        System.out.println("Employee Name "+ tenzing.getName());
        System.out.println("Employee Age " +tenzing.getAge());
        System.out.println("Employee Salary " +tenzing.getSalary());
        System.out.println("Employee HireDate "+tenzing.getHireDate());
        System.out.println("Employee Department " +tenzing.getDepartment());
        System.out.println("Employee DrivingLicenceNo "+ tenzing.getDrivingLicenceNo());

        Employee kushi= new Employee("tenzing",22,10000,Calendar.getInstance(),"Transportation","123789");

        System.out.println("Employee Name "+ kushi.getName());
        System.out.println("Employee Age " +kushi.getAge());
        System.out.println("Employee Salary " +kushi.getSalary());
        System.out.println("Employee HireDate "+kushi.getHireDate());
        System.out.println("Employee Department " +kushi.getDepartment());
        System.out.println("Employee DrivingLicenceNo "+ kushi.getDrivingLicenceNo());


}}

