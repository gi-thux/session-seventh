package day24;

public class AssertionPractice  {

    public static void main(String[] args) {
        int x=-2;

       /* if(x<0){
            throw new IllegalArgumentException("the value of x is negative");
        }*/
        assert x>=0 : "the value of x is negative";

        double sqrt = Math.sqrt(x);
        System.out.println("the square root of given no is "+ sqrt);

    }
}
