package multithreading;

public class MultiThreading_Race_P4 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread starts");

		// Creating a shared Brickmanagement instance for all threads
		Brickmanagement management = new Brickmanagement();

		// Runnable r1 increments the brick count in a loop
		Runnable r1 = () -> {
			for (int i = 0; i < 10000; i += 50) {
				management.updateBrickCount();
			}
		};
		// Runnable r2 does the same as r1
		Runnable r2 = () -> {
			for (int i = 0; i < 10000; i += 50) {
				management.updateBrickCount();
			}
		};
		// Runnable r3 does the same as r1 and r2
		Runnable r3 = () -> {
			for (int i = 0; i < 10000; i += 50) {
				management.updateBrickCount();
			}
		};

		// Starting threads with the respective runnable tasks
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

		// Ensuring main thread waits for t1, t2, and t3 to complete
		t1.join();
		t2.join();
		t3.join();

		// Printing the final values of brickCount and brickCount2
		System.out.println("Final brickCount (without synchronization): " + management.brickCount);
		System.out.println("Final brickCount2 (with synchronization): " + management.brickCount2);
	}
}

class Brickmanagement {
	int brickCount = 0; // Not synchronized, may lead to race conditions
	int brickCount2 = 0; // Synchronized block used, should avoid race conditions

	// Updates brickCount and brickCount2
	public void updateBrickCount() {
		// brickCount is incremented without synchronization
		brickCount += 50;

		// brickCount2 increment is synchronized to prevent race conditions
		synchronized (this) {
			brickCount2 += 50;
		}
	}
}
