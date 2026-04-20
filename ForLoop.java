package BasicJavaPrograms;

public class ForLoop {
    public static void main(String[] args) {
        // Printing numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " \n");
        }
        System.out.println();
        // Printing a simple string multiple times
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, Java!");
        }
    }

}
