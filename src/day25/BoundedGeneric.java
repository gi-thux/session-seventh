package day25;

public class BoundedGeneric {
    public static void main(String[] args) {
        maximum(4,7,1);
        var product1=new Product("A",200);
        var product2=new Product("B",300);
        var product3=new Product("C",100);
        maximum(product1,product2,product3);

        var item1=new Item("A",200);
        var item2=new Item("B",300);
        var item3=new Item("C",100);
       // maximum(item1,item2,item3); Not allowed by bonded type variable because comparable is not implemented
    }

/*    public static void maximum(int a, int b, int  c){
        int max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.println(max);
    }
    public static void maximum(Product a,Product b, Product c){
         E max=a;
        if(max.){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.println(max);


    }*/
    public static<E extends Comparable<E>> void maximum(E a, E b, E  c){
      E max = a;
        if(max.compareTo(b)<0){
            max=b;
        }
        if(max.compareTo(c)<0){
            max=c;
        }
        System.out.println(max);
    }

}
