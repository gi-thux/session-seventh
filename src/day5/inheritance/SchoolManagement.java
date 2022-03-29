package day5.inheritance;

public class SchoolManagement {
    public static void main(String[] args) {
        Student student= new Student();
        student.rollNumber=1;
        System.out.println(student.rollNumber);
       // student.setname="taman";
        student.setName("taman");



        Teacher teacher= new Teacher();
        teacher.setSubject("math");
        System.out.println(teacher.getSubject());

    }

}
