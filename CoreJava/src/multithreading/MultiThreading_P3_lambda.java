package multithreading;

public class MultiThreading_P3_lambda {

    public static void main(String[] args) throws InterruptedException {
        // Anonymous class for Runnable implementation
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println(i + " : Hi, I'm the thread created in r1 class");
                }
            }
        };

        // Another anonymous class for Runnable implementation
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i + " : Hi, I'm the thread created in r2 class");
                }
            }
        };

        // Lambda expression for Runnable implementation
        Runnable r3 = () -> {
            for (int i = 1; i <= 7; i++) {
                System.out.println(i + " : Hi, I'm the thread created in r3 class");
            }
        };

        // Creating threads with runnable implementations
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // Display initial state of t1 before starting
        System.out.println("State of t1 before start: " + t1.getState());
        
        // Start all threads
        t1.start();
        System.out.println("State of t1 after start: " + t1.getState());
        //t1.join();
        t1.sleep(1000);
        t2.start();
        t3.start();
        
        // Display state of t1 after starting other threads
        System.out.println("State of t1 after starting t2 and t3: " + t1.getState());

        /*
         * Thread lifecycle:
         * 1. NEW - thread created, but not yet started
         * 2. RUNNABLE - thread is ready to run or is running
         * 3. BLOCKED - thread is blocked, waiting for a monitor lock
         * 4. WAITING - thread is waiting indefinitely for another thread to perform an action
         * 5. TIMED_WAITING - thread is waiting for a specified amount of time
         * 6. TERMINATED - thread has completed execution
         */
    }
}
