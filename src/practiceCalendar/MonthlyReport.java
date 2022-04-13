package practiceCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MonthlyReport {
    private String name;
    private long account;
    private float gas;
    private float grocery;
    private float rent;
    private float entertainment;


    public String getName() {
        return name;
    }

    public long getAccount() {
        return account;
    }

    public float getGas() {
        return gas;
    }

    public float getGrocery() {
        return grocery;
    }

    public float  getRent() {
        return rent;
    }

    public float getEntertainment() {
        return entertainment;
    }
    public MonthlyReport(){
    }
    public MonthlyReport(String name,long account,float grocery,float gas,float entertainment){
        this.name=name;
        this.account=account;
        this.grocery=grocery;
        this.gas=gas;
        this.entertainment=entertainment;
    }
    public MonthlyReport(String name,long account,float grocery,float gas,float rent,float entertainment){
        this(name,account,grocery,gas,entertainment);
        this.rent=rent;
    }
    public  void expenses(){
        MonthlyReport cal= new MonthlyReport();
        cal.calendar();
        /* Scanner input = new Scanner(System.in);
        System.out.println("enter the amount spent for gas ");
        float gas =input.nextInt();
        System.out.println("enter the amount spent for rent ");
        float  rent=input.nextInt();
        System.out.println("enter the amount spent for grocery ");
        float grocery =input.nextInt();
        System.out.println("enter the amount spent for entertainment ");
        float entertainment =input.nextInt();*/

        float totalExpenditure=gas+grocery+rent+entertainment;
        System.out.println("the total expenditure for today"+ totalExpenditure);

    }

    public void calendar(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day of the month ");
        int day = input.nextInt();
        System.out.println("enter the month");
        int month = input.nextInt();
        System.out.println("enter the current year");
        int year = input.nextInt();

       /* Date date = new Date();
        System.out.println("today date " + date);*/
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        //System.out.println("this given date is " + Month.of(calendar.get(Calendar.MONTH)).name() + " " + calendar.get(Calendar.DAY_OF_MONTH) + " " + (calendar.get(Calendar.YEAR)));

        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy  HH:mm:ss");
        String abc=sdf.format(calendar.getTime());
        System.out.println("the transaction date is " + sdf.format(calendar.getTime()));

    }

}
