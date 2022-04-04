package day6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;


public class PreDefinedClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);

        Calendar dateOfBirthday =Calendar.getInstance();
        dateOfBirthday.set(Calendar.YEAR,1999);
        dateOfBirthday.set(Calendar.MONTH,10);
        dateOfBirthday.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(dateOfBirthday.getTime());

        System.out.println("My Birthday date is  "+Month.of(dateOfBirthday.get(Calendar.MONTH)).name()+" "+ dateOfBirthday.get(Calendar.DAY_OF_MONTH ) + " " + dateOfBirthday.get(Calendar.YEAR));

        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy HH:mm:ss");
        System.out.println(" my birthday is in " + sdf.format(dateOfBirthday.getTime()));


       /* PreDefinedClass calender = getInstance();
        System.out.println(calender.time());
*/
}}
