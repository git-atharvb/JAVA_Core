package BasicJavaPrograms.PolyMorphism;
public class CompileTimePoly {
    public static void main(String[] args) {
        // Method Overloading Example
        System.out.println("Method Overloading:");
        System.out.println(add(5, 10)); // Calls add(int, int)
        System.out.println(add(5.5, 10.5)); // Calls add(double, double)
        System.out.println(add(5, 10, 15)); // Calls add(int, int, int)
    }
    // Method overloading with different number of parameters
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}