package Multithreading;

// Java Program to Illustrate Priorities in Multithreading via help of getPriority() and setPriority() method.

class JavaThreadPriorities extends Thread {

    // run() method for the thread that is called as soon as start() is invoked for
    // thread in main()
    @Override
    public void run() {

        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        // Creating random threads with the help of above class
        JavaThreadPriorities t1 = new JavaThreadPriorities();
        JavaThreadPriorities t2 = new JavaThreadPriorities();
        JavaThreadPriorities t3 = new JavaThreadPriorities();

        // Thread 1
        // Display the priority of above thread using getPriority() method
        System.out.println("t1 thread priority : " + t1.getPriority());

        // Thread 2 Display the priority of above thread
        System.out.println("t2 thread priority : " + t2.getPriority());

        // Thread 3
        System.out.println("t3 thread priority : " + t3.getPriority());

        // Setting priorities of above threads by passing integer arguments
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority : " + t1.getPriority());

        System.out.println("t2 thread priority : " + t2.getPriority());

        System.out.println("t3 thread priority : " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

        // Main thread Displays the name of currently executing Thread
        System.out.println("Currently Executing Thread : " + Thread.currentThread().getName());

        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

        // Main thread priority is set to 10
        Thread.currentThread().setPriority(10);

        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
    }
}
