package com.oops.interfeces;

public class Main {

    public static void main(String[] args) {
        Apple appleLaptop = new Apple();
        Lenovo lenovoLaptop = new Lenovo();

        System.out.println("Apple Laptop:");
        appleLaptop.powerOn();       // Inherited from Computer
        appleLaptop.copy();          // From Laptop interface
        appleLaptop.touch();         // From TouchScreen interface
        appleLaptop.camera();        // Unique to Apple

        System.out.println("\nLenovo Laptop:");
        lenovoLaptop.powerOn();      // Inherited from Computer
        lenovoLaptop.copy();         // From Laptop interface
        //lenovoLaptop.touch();      // Not available in Lenovo, as it doesn't implement TouchScreen
    }
}
