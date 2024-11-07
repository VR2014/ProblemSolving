package multithreading;

public class Multithreading_P1 {

	public static void main(String[] args) {
		// Default Thread initialization starts
		System.out.println("Current  Thread Details " + Thread.currentThread());
		System.out.println("Threading starts");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		// Priority variours (0-10) low -0 min-5 max -10
		System.out.println(Thread.currentThread().getPriority());

		// Create a Thread

		Thread t1 = new Thread();
		System.out.println("t1 Thread starts");
		t1.start();

		Thread t2 = new Thread();
		System.out.println("t2 Thread starts");
		t2.start();
		Thread t3 = new Thread();
		System.out.println("t3 Thread starts");
		t3.start();
		Thread t4 = new Thread();
		System.out.println("t4 Thread starts");
		t4.start();

		System.out.println("Current  Thread Details " + Thread.currentThread());
		System.out.println("Current Active Threads " + Thread.activeCount());

	}

}
