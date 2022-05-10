package day25;

public class GenericMethod {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"a", "b", "c", "d", "e", "f"};
        printArray(integers);
       printArray(strings);
    }

   /*public static void printArray(int[] integers) {
    for (Integer integer : integers) {
        System.out.println(integer);
    }}
    public static void printArray(String[] strings) {
        for(String string : strings){
            System.out.println(string);}
        }*/


    public static <E> void printArray(E[] arrays){

        for(E value: arrays){
            System.out.println(value);

    }
}


}

