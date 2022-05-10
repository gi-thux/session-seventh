package day23;

import java.io.IOException;

public class ExceptionPractice {
    public static void main(String[] args) {
        SomeOperation operation = new SomeOperation();

        try{
            operation.divideNumber(10, 0);}
        catch(ArithmeticException | NullPointerException | IndexOutOfBoundsException ae){
            System.out.println(ae);
           // System.out.println("sending these error to server analytics");
        }

        try {
            operation.someFunctionThatThrowsIOException();
        }catch(IOException e){
            e.printStackTrace();
        }

        }
    }
