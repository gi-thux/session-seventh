package day24;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void registerUser()throws AgeRestrictionException{
        //some code to register user
        if(this.age<18){
           // System.out.println("your age is less than 18, so you cannot register to the application");
        throw new AgeRestrictionException("your age is less than 18, so you cannot register to the application");
        }
        else{
            //some code to store the user in the database
            System.out.println(this.name + "this name is saved to the database");
        }
    }
}
