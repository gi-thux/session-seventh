package day10;

public class TestingEquility {
    public static void main(String[] args) {


        String greeting ="Hello";
        boolean isEquals1=greeting =="hello";
        System.out.println(isEquals1);

        String subString = greeting.substring(0,3);
        System.out.println(subString);
        boolean isequal2=subString.equals("Hel");
        System.out.println(isequal2);
        boolean isequal3="hello".equalsIgnoreCase("Hello");
        System.out.println(isequal3);

    }


}
