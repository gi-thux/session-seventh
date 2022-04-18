
import java.io.Console;
import java.util.Scanner;

public class UserCLIinput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        Console con= System.console();
        System.out.println("Enter the userName");
        String userName = con.readLine();
       // String userName = input.next();

                System.out.println("Enter the password");
        char [] passwordArray=con.readPassword();
        String password= String.valueOf(passwordArray);
        System.out.println(password);


       // String password= input.next();
        if(!password.equals("admin123")){
            System.out.println("your password is wrong and you are not authorized to log in");
            System.exit(0);}

        System.out.println("Enter the full name of the student");
        String name=input1.nextLine();
        System.out.println("Enter marks in math");
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

        //String output= String.format("the percentage of %S is %.2 ",name,percentage);
       // System.out.println(output);





    }

}
