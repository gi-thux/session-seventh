package practiceGeneric;

import java.util.logging.Logger;

public class GenericMethod {



    public static void main(String[] args) {
        var genericClass= new GenericClass("january", 100F);
        var genericClass1= new GenericClass("february",200F);
        var genericClass2= new GenericClass("march",150F);
        var genericClass3= new GenericClass("april",300F);
        maximum(genericClass,genericClass1,genericClass2,genericClass3);

        Integer [] abc= {5,6,7,8,9};
        String [] rosy={"a","e","i","o","u"};
        array(abc);
        array(rosy);
    }
   /* public static void array(int[] abc){
        for(int a:abc){
            Logger.getGlobal().info(String.valueOf(a));
        }
    }
    public static void array(String[] rosy){
        for(String s:rosy){
            Logger.getGlobal().info(String.valueOf(s));

        }*/
        public static<E> void array(E[] array){
            for(E s:array){
               // Logger.getGlobal().info(String.valueOf(s));
                System.out.println(s);
    }}

    public static<E extends Comparable<E>> void maximum(E a,E b, E c, E d){
       E max=a;
       if(max.compareTo(b)<0){
           max=b;
       }
        if(max.compareTo(c)<0){
            max=c;
        }
        if(max.compareTo(d)<0) {
            max = d;
        }
        Logger.getGlobal().info(String.valueOf(max));
    }

}




