package day15;

public final class Executive extends Manager {
    private float shareAmount;

    public Executive(String name,int age,float salary,float bonus,float shareAmount){
        super(name,age,salary,bonus);
        this.shareAmount=shareAmount;
    }

    @Override
    public float getSalary() {
      float  salary=shareAmount+super.getSalary();
        return salary;
    }
    public void fireEmployee(){
        System.out.println("is fired");
    }

}
