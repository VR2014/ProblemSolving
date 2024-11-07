package com.oops;

public class SuperAndThis {

	public static void main(String[] args) {
		Dogs dog = new Dogs("Buddy", "Labrador");
	}
}

class Animalss {
	String name;

	public Animalss(String name) {
		this.name = name; // 'this' refers to the current object's name
		System.out.println("Animal created: " + name);
	}
}

class Dogs extends Animalss {
	String breed;

	public Dogs(String name, String breed) {
		super(name); // 'super' calls the parent constructor
		this.breed = breed;
		System.out.println("Dog created: " + breed);
	}
}

/*
 *
 * super: Used to refer to the parent class (for methods, variables, or
 * constructors). this: Used to refer to the current class (for instance
 * variables or constructor chaining).
 */
