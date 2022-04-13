package day11;

import java.util.Scanner;

public class UserCLIinput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the userName");
        String userName=input.next();
        System.out.println("Enter the password");
        String password=input.next();

        System.out.println("Enter the full name of the student");
        String name=input1.nextLine();
        System.out.print("Enter marks in math");
        float math= input.nextFloat();
        System.out.println("Enter marks in science");
        float science= input.nextFloat();
        System.out.println("Enter marks in computer");
        float computer= input.nextFloat();
        System.out.println("Enter marks in english");
        float english= input.nextFloat();
        System.out.println("Enter marks in social Study");
        float socialStudy= input.nextFloat();
        float total=math+science+computer+english+socialStudy;
        float percentage=(total/500)*100;

        System.out.println("the percentage of "+ name + " is " + percentage+" %");





    }

}
