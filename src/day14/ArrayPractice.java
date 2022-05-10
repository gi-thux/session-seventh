package day14;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        String[] names = {"hari", "sita", "geeta", "ram", "krishna", "balaram"};

        String[] totalPlayers = names;
        totalPlayers[5] = "rawan";


        for (String abc : names) {
            System.out.println("the names of the players are" + " " + abc);

        }
        for (String def : totalPlayers) {
            System.out.println("the names of the players are" + " " + def);

        }

        //trying to remove an element from array
   /*
     function removeItemOnce(arr,1){
            var index = arr.indexOf(1);
            if(index > -1){
                arr.splice(index,1);}
            return arr;}
    }
        */


    }


}
