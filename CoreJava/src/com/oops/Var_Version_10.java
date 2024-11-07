package com.oops;

import java.util.Arrays;  // Import Arrays class

public class Var_Version_10 {

    public static void main(String[] args) {
        var k = 1000;             // inferred as int
        var a = "vamsi";          // inferred as String
        var k1 = false;           // inferred as boolean
        var var = 77.99;        // inferred as double
        var arr = new int[] {1, 2, 3, 4, 5};  // inferred as int[]

        System.out.println(k);
        System.out.println(a);
        System.out.println(k1);
        System.out.println(var + var);   

        // Printing array contents using Arrays.toString()
        System.out.println(Arrays.toString(arr));  // This will print the array contents
    }

}


/*
Type Inference (Java 10):
Introduced in Java 10.
Before Java 10, we had to specify the data type for every variable.
var keyword allows the compiler to automatically determine the type based on the assigned value.
Key Points:
Usage:

var is used for local variables only (inside methods, loops, etc.).
Example:

var number = 10;   // inferred as int
var name = "Java"; // inferred as String
Compile-Time: The type is determined at compile time based on the assigned value.

Restrictions:
Only for local variables (not instance variables, class variables, or method parameters).

*/