package day2;

import java.util.Scanner;

public class VariableAndConstant {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the operation simple or complex");
        String operation=sc.next();
        switch (operation){
            case "simple":
                System.out.println("enter the number a");
        int a=sc.nextInt();
        System.out.println("enter the number b");
        int b=sc.nextInt();
        System.out.println("enter the number c");
        float c=sc.nextInt();
        double product =(a+b)*c;
        System.out.println("the sum of a and b multiplying c is " + product);
       break;
            case "complex":
        System.out.println("enter a number to perform operation");
        int x=sc.nextInt();
        x += 2;
        x *= 3;
                System.out.println("the result of the operation is "+ x);

                break;

            default:
                System.out.println("wrong choice");
                break;




    }}}
