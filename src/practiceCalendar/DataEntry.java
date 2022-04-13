package practiceCalendar;

import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
       /* MonthlyReport cal= new MonthlyReport();
        cal.calendar();*/
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name ");
        String name = input.next();
        System.out.println("enter the account no ");
        long accountNo = input.nextInt();
        String decision = " ";
        do {
            System.out.println("enter the operation to perform MonthlyExpense|Others");
            String operation = input.next();

            switch (operation) {
                case "MonthlyExpense":
                    System.out.println("enter the amount spent for gas ");
                    float gas = input.nextInt();
                    System.out.println("enter the amount spent for rent ");
                    float rent = input.nextInt();
                    System.out.println("enter the amount spent for grocery ");
                    float grocery = input.nextInt();
                    System.out.println("enter the amount spent for entertainment ");
                    float entertainment = input.nextInt();
                    MonthlyReport report = new MonthlyReport(name, accountNo, grocery, gas, rent, entertainment);
  /*   System.out.println("the rent collected is "+ m.getRent());
            MonthlyReport obj = new MonthlyReport();*/
                report.expenses();
                    break;

                case "Others":
                    System.out.println("other function will be added soon...");
                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }
                System.out.println("do you want to run the code again? enter YES/NO");
                decision = input.next();
            }
            while (decision.equalsIgnoreCase("YES")) ;

            System.out.println("bye bye happy coding see you again");

        }


    }
