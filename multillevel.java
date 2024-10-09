// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child) inheriting from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on legs.");
    }
}

// Another derived class (Grandchild) inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test multilevel inheritance
public class multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling methods from all levels of inheritance
        dog.eat();  // From Animal class
        dog.walk(); // From Mammal class
        dog.bark(); // From Dog class
    }
}

