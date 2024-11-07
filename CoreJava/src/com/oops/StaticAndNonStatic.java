package com.oops;
class StaticAndNonStatic {
    
    // Static variable
    static int staticVar = 10;
    
    // Non-static variable
    int nonStaticVar = 20;

    // Static block: Executes before the main method
    static {
        System.out.println("Static Block Executed");
        // Initializing static variables
        staticVar = 30;
    }

    // Non-static block: Executes before the constructor
    {
        System.out.println("Non-Static Block Executed");
        // Initializing non-static variables
        nonStaticVar = 40;
    }

    // Constructor
    public StaticAndNonStatic() {
        System.out.println("Constructor Executed");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("Non-Static Method Called");
    }

    public static void main(String[] args) {
        // Calling static method using class name
    	StaticAndNonStatic.staticMethod();

        // Creating object of StaticAndNonStatic class
    	StaticAndNonStatic obj = new StaticAndNonStatic();

        // Accessing static and non-static variables
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non-Static Variable: " + obj.nonStaticVar);

        // Calling non-static method using object reference
        obj.nonStaticMethod();
    }
}

