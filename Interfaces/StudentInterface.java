package BasicJavaPrograms.Interfaces;
class Student{
    String name;
    static String school;
    // Static variables and methods belong to the class rather than to any specific instance of the class. This means that they can be accessed without creating an object of the class. In this example, we can access the static variable 'school' using the class name 'Student.school' without creating an object of the Student class.
    public static void changeSchool(String newSchool){
        school = newSchool;
    }
}
public class StudentInterface {
    public static void main(String[] args) {
    Student.school = "DSRV School";
    Student student1 = new Student();
    student1.name = "Atharv";
    System.out.println(Student.school);
    }
}