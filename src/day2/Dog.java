package day2;

public class Dog {
    String name;
    int age;
    String colour;
    String breed;
    String behaviour;

    public  void eat(){
                        System.out.println(" the dog is eating");
    }

    public static void sleep(String name){
                       System.out.println(name + " is sleeping");
    }

    public  void play(){
        System.out.println("the dog is playing");
    }

    public static void main(String[] args) {
        Dog rambo= new Dog();
            rambo.name="rambo";
        rambo.age=2;
        rambo.behaviour="naughty";
        rambo.colour="black and brown";
       Dog bruno= new Dog();
           bruno.name="bruno";
            bruno.age=2;
            bruno.colour="white and brown";
            bruno.breed="german shepard";
            bruno.behaviour="friendly";
            rambo.breed="german shepard";
    Dog.sleep("bruno");
     bruno.play();
    }}