package BasicJavaPrograms;
import java.util.Scanner;
public class SumOfNnumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}