package BasicJavaPrograms;
import java.util.*;
// * means importing everything from that package...
public class InputProgram {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
        sc.close();
        //close() is used to close the scanner object and free up resources. It's a good practice to close the scanner when it's no longer needed.
    }
}
