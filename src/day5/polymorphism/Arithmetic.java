package day5.polymorphism;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
       /* int c = a + b;
        System.out.println(c);*/
        addNumber(a,b);

        int d = 3;
        int e= 2;
        /*int f = d + e;
        System.out.println(f);*/
        addNumber(d,e);

        float g = 1.7f;
        int h = 2;
       /* float i = g+ h;
        System.out.println(i);*/
        //addFloatNumber(g,h);
        addNumber(g,h);

    }

    public static void addNumber(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
        /* making same method with different paramater
        public static void addFloatNumber(float a, int b){
            float c= a+b;
            System.out.println(c);
*/

    public static void addNumber(float a, float b) {
        float c = a + b;
        System.out.println(c);
    }
    }
