package BasicJavaPrograms;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Printing numbers from 1 to 10 using do-while loop
        System.out.println("Numbers from 1 to 10:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
        // Printing a simple string multiple times using do-while loop
        int count = 0;
        do {
            System.out.println("Hello, Java!");
            count++;
        } while (count < 5);
    }
}
