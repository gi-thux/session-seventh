package day10;

public class StringPractice {

    public static void main(String[] args) {
         String s1="sunny";

         String s2= new String("sunny");

         String s3= "sunny";

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        String greeting =" Hello";
        String s= greeting.substring(1,3);
        System.out.println(s);

        String today="tuesday ";
        String tDate="04/12/2022 ";
        String journal=today + tDate;
        String plus=today.concat(tDate);
        System.out.println(journal);
        System.out.println(plus);

        String s5= String.join("/","S","M","L","XL");
        System.out.println(s5);

        String allAnother="s"+"/"+"M"+"/"+"L"+"/"+"XL";
        System.out.println(allAnother);

        String repeated= "hey".repeat(17);
        System.out.println(repeated);

        StringBuilder sb = new StringBuilder();
        sb.append("s");
        sb.append("-");
        sb.append("m");
        sb.append("-");
        sb.append("a");
        sb.append("-");
        sb.append("r");
        sb.append("-");
        sb.append("t");
        String concanatedtoString =sb.toString();
        System.out.println(concanatedtoString);

        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<=20; i++) {
            sb1.append("ola");
        }
        String conectedString = sb1.toString();
        System.out.println(conectedString);






    }
}
