package day20.day21;

import java.util.ArrayList;
import java.util.EnumSet;

public class DailyWork {
    public static void main(String[] args) {
        ArrayList<Day>  days=new ArrayList<>();
        days.add(Day.MONDAY);
        days.add(Day.TUESDAY);
        days.add(Day.WEDNESDAY);
        days.add(Day.THURSDAY);
        days.add(Day.FRIDAY);
        days.add(Day.SATURDAY);
        days.add(Day.SUNDAY);
        System.out.println(days);

        EnumSet<Day> allDay=EnumSet.allOf(Day.class);



    }
}
