package day8;

import java.util.Calendar;

public class Employee {

    private  String name;
    private  int age;
    private String Department;
    private double salary;
    private Calendar hireDate;
    private String drivingLicenceNo;
    private String SSN;

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    private static int employeeCount;

    public Calendar getHireDate() {
        return hireDate;
    }
    public String getSSN() {
        return SSN;
    }

    public String getDrivingLicenceNo() {
        return drivingLicenceNo;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return Department;
    }

    public double getSalary() {
        return salary;
    }

    /*public void setCalendar(Calendar calendar) {
        this.calendar =calendar ;}
    public void setHireDate(Calendar hireDate) {
        Calendar dateOfBirthday = Calendar.getInstance();
        dateOfBirthday.set(Calendar.YEAR, 1999);
        dateOfBirthday.set(Calendar.MONTH, 10);
        dateOfBirthday.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(dateOfBirthday.getTime());
  System.out.println("My Birthday date is  " + Month.of(dateOfBirthday.get(Calendar.MONTH)).name() + " " + dateOfBirthday.get(Calendar.DAY_OF_MONTH) + " " + dateOfBirthday.get(Calendar.YEAR));
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy HH:mm:ss");
  }      System.out.println(" my birthday is in " + sdf.format(dateOfBirthday.getTime()));
*/
    public Employee(){
    System.out.println("default constructor called");
}

public Employee(String name, int age, double salary, Calendar hireDate, String Department){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.hireDate=hireDate;
        this.Department=Department;

}
    public Employee(String name, int age, double salary, Calendar hireDate, String Department, String drivingLicenceNo ){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.hireDate=hireDate;
        this.Department=Department;
        this.drivingLicenceNo=drivingLicenceNo;

    }
    //explit parameter
public void fireEmployee(Employee employee){
    System.out.println(employee.getName()+ " is fired");
}
//implicit parameter
    public void fireEmployee(){
        System.out.println(this.getName()+ " is fired");
    }
}

