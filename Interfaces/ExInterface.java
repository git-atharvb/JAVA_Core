package BasicJavaPrograms.Interfaces;
interface Animal {
    int eyes = 2; // All variables in an interface are public, static and final by default, so we don't need to use the abstract, public, static and final keywords here.
    void walk();
    // Cannot have a constructor in an interface because we cannot create an object of an interface. We can only create an object of a class that implements the interface.
    // All methods in an interface are abstract by default, so we don't need to use the abstract keyword here. Also, we cannot have a method body in an interface method.    
}
interface Herbivore {
    void eatGrass();
}
class Horse implements Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
public class ExInterface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}