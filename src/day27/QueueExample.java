package day27;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {


        /*ArrayDeque<Integer> integers=  new ArrayDeque<>( );
        integers.add(2);
        integers.add(6);
        integers.add(4);
        integers.add(7);
        System.out.println(integers);
        Integer i =integers.pop();
        System.out.println(i);
        System.out.println(integers);
        Integer j =integers.pop ();
        System.out.println(j);
        System.out.println(integers);
*/
        PriorityQueue<Integer> integers=  new PriorityQueue<>( );
        integers.add(2);
        integers.add(6);
        integers.add(4);
        integers.add(7);
        System.out.println(integers);
// data will be sorted while removing the data using remove method
        int a= integers.remove();
        int b= integers.remove();
        int c= integers.remove();
        int d= integers.remove();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

       /* Integer i =integers.remove();
        System.out.println(i);
        System.out.println(integers);
        Integer j =integers.remove();
        System.out.println(j);
        System.out.println(integers);*/

    }
}
