package com.oops;

// Base class representing an Animal
class Animal {
    String food = "pedigree"; // Default food for an animal

    // Method to simulate eating behavior
    public void eat() {
        System.out.println("Animal is eating: " + food);
    }
}

// Subclass Dog inheriting from Animal
class Dog extends Animal {
    String sound = "Barking"; // Sound characteristic of a dog
    String biting = "Biting"; // Biting behavior of a dog

    // Constructor for Dog class
    public Dog() {
        System.out.println("Dog class constructor");
    }

    // Method to simulate barking behavior
    public void bark() {
        System.out.println("Dog is barking: " + sound);
    }

    // Method to simulate biting behavior
    public void biting() {
        System.out.println("Dog is: " + biting);
    }
}

// Subclass Puppy inheriting from Dog
class Puppy extends Dog {
    String weep = "Weeping"; // Weeping behavior of a puppy

    // Constructor for Puppy class, calls the superclass constructor (Dog)
    public Puppy() {
        super();
        System.out.println("Puppy class constructor");
    }

    // Method to simulate weeping behavior specific to Puppy
    public void weeping() {
        System.out.println("Puppy is: " + weep);
        System.out.println("Puppy inherited sound: " + super.sound); // Accessing superclass field
    }

    // Overriding the biting method from Dog class
    @Override
    public void biting() {
        super.biting(); // Calling the superclass method
    }
}

// Main class to demonstrate multilevel inheritance
public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an instance of Puppy
        Puppy puppy = new Puppy();

        // Setting the food type for the puppy
        puppy.food = "milk";

        // Calling methods inherited from Animal and Dog, as well as specific to Puppy
        puppy.eat();        // Inherited from Animal
        puppy.bark();       // Inherited from Dog
        puppy.weeping();    // Defined in Puppy
        puppy.biting();     // Overridden method from Dog
    }
}
