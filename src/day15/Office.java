package day15;

public class Office {


    public static void main(String[] args) {

        Employee employee = new Employee("birendra", 33, 2000);
        Employee manager = new Manager("kamal", 35, 3000, 1000);
        Executive executive = new Executive("sayukta", 25, 30500, 1000, 500);
        Cleaner clean = new Cleaner("hero", 33, 1500);

       // man.fireEmployee(new Employee(man.getName(),35,1000));

        System.out.println(employee.getSalary());
        System.out.println(executive.getSalary());
        System.out.println(clean.getSalary());
        System.out.println(manager.getSalary());

       Employee[] employees = new Employee[4];

       employees[0]=employee;
        employees[1]=manager;
        employees[2]=clean;
        employees[3]=executive;



        System.out.println(employees[0].getSalary());
        System.out.println(employees[1].getSalary());
        System.out.println(employees[2].getSalary());
        System.out.println(employees[3].getSalary());

        //type casting since there is no Bonus method in employee class example int a= (int)5.0;
        ((Manager)employees[1]).getBonus();







    }

}