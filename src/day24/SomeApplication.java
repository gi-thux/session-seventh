package day24;

public class SomeApplication {

    public static void main(String[] args) {
        User user1= new User("abc",20);

        try {
            user1.registerUser();
        } catch (AgeRestrictionException e) {
            e.printStackTrace();
        }finally{
            System.out.println("finally block code is called");
        }
//
//        User user2= new User("def",20);
//
//        try {
//            user2.registerUser();
//        } catch (AgeRestrictionException e) {
//            e.printStackTrace();
//        }
   }
}
