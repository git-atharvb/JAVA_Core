package BasicJavaPrograms;
import java.util.Scanner;
public class Input_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A : ");
        int a = sc.nextInt();
        System.out.println("Enter number B : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        int difference = a - b;
        System.out.println("The difference is: " + difference);
        int product = a * b;
        System.out.println("The product is: " + product);
        int quotient = a / b;
        System.out.println("The quotient is: " + quotient);
        int remainder = a % b;
        System.out.println("The remainder is: " + remainder);   
        sc.close();
    }
}