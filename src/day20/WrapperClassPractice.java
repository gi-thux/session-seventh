package day20;

import java.util.ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {
        int a= 25;
        Integer b= 25;
        Integer c=25;
        Integer d= c+b;
        int e=c;
     Boolean abc=true;

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(3);
        System.out.println(ints);

        int sumdata=ints.get(1);
        System.out.println(sumdata);

        String money="500";
        int abcd=Integer.parseInt(money);
        System.out.println(abcd+11);
    }
}
