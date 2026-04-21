package BasicJavaPrograms.PolyMorphism;
public class RunTimePoly {
    public static void main(String[] args) {
        // Creating an instance of the Dog class and calling the makeSound method
        Animal myDog = new RunTimePoly().new Dog();
        myDog.makeSound(); // Output: Dog barks
        // Creating an instance of the Cat class and calling the makeSound method
        Animal myCat = new RunTimePoly().new Cat();
        myCat.makeSound(); // Output: Cat meows
    }   
    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    class Dog extends Animal {
        void makeSound() {
            System.out.println("Dog barks");
        }
    }
    class Cat extends Animal {
        void makeSound() {
            System.out.println("Cat meows");
        }
    }
}