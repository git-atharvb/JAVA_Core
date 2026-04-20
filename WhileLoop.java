package BasicJavaPrograms;

public class WhileLoop {
    public static void main(String[] args) {
        // Printing numbers from 1 to 10 using while loop
        System.out.println("Numbers from 1 to 10:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // Printing a simple string multiple times using while loop
        int count = 0;
        while (count < 5) {
            System.out.println("Hello, Java!");
            count++;
        }
    }
}
