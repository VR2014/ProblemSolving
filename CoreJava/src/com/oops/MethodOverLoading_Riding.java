package com.oops;

public class MethodOverLoading_Riding {

	public static void main(String[] args) {
		Crow animal = new Crow();
		animal.eating("Grass"); // Calls eating method with a String parameter
		animal.eating(5); // Calls eating method with an int parameter
	}

}

class Animals {
	// Method overloading by using different parameter types
	public void eating(String food) {
		System.out.println("Animal eating: " + food);
	}

	public void eating(int quantity) {
		System.out.println("Animal eating quantity: " + quantity + " units");
	}
}

class Crow extends Animals {
	@Override
	public void eating(String food) {
		System.out.println("Crow eating: " + food);
	}
}

