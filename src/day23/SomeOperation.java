package day23;

import java.io.IOException;

public class SomeOperation {



    public void divideNumber(int a,int b) throws ArithmeticException,NullPointerException, IndexOutOfBoundsException {
        int div=a/b;
        System.out.println("The division of given no is " + " " + div);
    }

    public void someFunctionThatThrowsIOException() throws IOException {

    }
}
