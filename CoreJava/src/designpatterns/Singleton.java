package designpatterns;

public class Singleton {
    // Step 1: Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Step 2: Static variable to hold the single instance
    private static Singleton single;

    // Step 3: Public method to provide access to the single instance
    public static Singleton getSingleton() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    // Method to explain how Singleton works
    public void showMessage() {
        System.out.println("How the Singleton Pattern Works:\n");
        System.out.println("1. The constructor is private, so no other class can create an instance using 'new'.");
        System.out.println("2. A static variable 'single' is declared to hold the single instance of the class.");
        System.out.println("3. The 'getSingleton()' method checks if the 'single' variable is null.");
        System.out.println("   - If it is null, a new instance is created and assigned to 'single'.");
        System.out.println("   - If it is not null, the existing instance is returned.");
        System.out.println("4. This ensures only one instance of the class exists, no matter how many times 'getSingleton()' is called.");
    }
}
