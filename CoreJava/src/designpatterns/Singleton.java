package designpatterns;

public class Singleton {

	// STEP 1: MAKE THE CONSTRUCTOR PRIVATE
	private Singleton() {

	}

	// Step 2: Create a private static instance of the class
	private static Singleton single;

	// Step 3: Provide a public method to get the instance
	public static Singleton getSingleton() {
		// Step 4: Initialize the instance only if it doesn't already exist
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}

	public void showMessage() {
		System.out.println("Singleton message ");
	}
}
