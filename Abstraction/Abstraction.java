package BasicJavaPrograms.Abstraction;
abstract class Animal{
    public abstract void walk();
    // Can have non-abstract methods as well
    public void eat(){
        System.out.println("Animal eats food");
    }
    // Can have a constructor as well
    Animal(){
        System.out.println("New Animal Concstructor is created");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("New Horse Constructor is created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        // Animal animal = new Animal();
        // animal.walk();
        // Runtime error here because we cannot create an object of an abstract class (Cannot instantiate the type Animal)
        Chicken chicken = new Chicken();
        chicken.walk();
    }
}