package designpatterns;
public class Main {
    public static void main(String[] args) {
        // Access the single instance of Singleton
    	Singleton singleton = Singleton.getSingleton();
        
        // Call a method on the Singleton instance
        singleton.showMessage();
    }
}
