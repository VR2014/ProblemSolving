package com.oops;

public class Contructors {

    public static void main(String[] args) {

        Person p = new Person();
        /*p.setAddress("Bangalore");
        p.setName("Kishore Reddy");
        */
        System.out.println(p.getname() + " ::  " + p.getAddress());

        Person p1 = new Person("Vamsi", "Kottalapalli");
        System.out.println(p1.getname() + " :: " + p1.getAddress());

    }

}

class Person {

    // Constructor can be public, protected, or private. 
    // It cannot be final or default (default access modifier is not allowed).
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
        this("Ankireddy", "Kadapa"); // Calls the parameterized constructor
    }

    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}


/*
 * Constructors are used to initialize objects, and they do not have a return type.
 * If no constructor is provided, a default constructor will be automatically provided.
 * If you create a parameterized constructor, you must also provide a default constructor if needed.
 * 
 * There are two types of constructors:
 * - Default Constructor: A constructor with no parameters.
 * - Parameterized Constructor: A constructor with parameters.
 * 
 * Constructors can be:
 * - public
 * - protected
 * - private
 * They cannot be:
 * - final
 * - default (default access level within the class)
 * 
 * Constructor Overloading: 
 * Yes, constructor overloading is possible because you can have both default and parameterized constructors in the same class.
 * 
 * Constructor Overriding:
 * Constructor overriding is not possible because constructors are not inherited. 
 * To access superclass members (constructors, variables, methods), we use `super()`.
 */

