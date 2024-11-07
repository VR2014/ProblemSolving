package multithreading;

public class MultiThreading_P2 {

    public static void main(String[] args) {
        System.out.println("Main thread :: " + Thread.currentThread().getName() + " :: ID = "
                + Thread.currentThread().getId());
        System.out.println("Current active thread count :: " + Thread.activeCount());
        System.out.println();

        // Start Employee thread
        Employee em = new Employee("Employee");
        System.out.println("Starting Employee thread...");
        em.start();
        System.out.println("Employee thread started.");
        System.out.println();

        // Start Manager thread
        Manager ma = new Manager("Manager");
        System.out.println("Starting Manager thread...");
        ma.start();
        System.out.println("Manager thread started.");
        System.out.println();

        // Start Management thread via Runnable interface
        Management m1 = new Management();
        Thread t1 = new Thread(m1, "Management"); // Name given to Runnable-based thread
        System.out.println("Starting Management thread...");
        t1.start();
        System.out.println("Management thread started.");
        System.out.println("Current active thread count :: " + Thread.activeCount());
        System.out.println();

        System.out.println("All threads initiated.");
        System.out.println("Final count of active threads :: " + Thread.activeCount());
    }
}

class Employee extends Thread {
    // Set thread name using constructor
    public Employee(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread :: " + Thread.currentThread().getName() + " :: ID = "
                + Thread.currentThread().getId());
        System.out.println("Hi, I'm the thread created in the Employee class.");
    }
}

class Manager extends Thread {
    // Set thread name using constructor
    public Manager(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread :: " + Thread.currentThread().getName() + " :: ID = "
                + Thread.currentThread().getId());
        System.out.println("Hi, I'm the thread created in the Manager class.");
    }
}

/*
 * Runnable interface used here to create Management thread.
 * Using Runnable allows us to implement multiple inheritance
 * with threads in Java.
 */
class Management implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread :: " + Thread.currentThread().getName() + " :: ID = "
                + Thread.currentThread().getId());
        System.out.println("Hi, I'm the thread created in the Management class using Runnable.");
    }
}
