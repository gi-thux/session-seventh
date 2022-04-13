package day10;

public class EmptyString {
    public static void main(String[] args) {


        String emptyString = " ";
        String emptyString1 = " H EY";
        System.out.println(emptyString.length());
        System.out.println(emptyString1.trim().length());

        System.out.println(emptyString.isEmpty() );
        System.out.println(emptyString.isBlank() );


    }
}