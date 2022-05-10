package day20;

public class EllipseOperatorPractice {
    public static void main(String[] args) {

        add(2,5);
        //System.out.println(add(2,3));
    }

    public static void add(int... values){
        int temp=0;
       for(int value: values) {
           temp = temp + value;
       }
       System.out.println(temp);
    }
}
