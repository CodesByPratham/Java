package Multithreading;

import javax.management.ConstructorParameters;

class MyThread extends Thread {

    @ConstructorParameters({ "name" })
    MyThread(String name) {

        super(name);

        // Returns a reference to the currently executing thread object
        System.out.println("Reference of this thread: " + currentThread());

        // Returns this thread’s name
        System.out.println("Name of this thread: " + getName());

        // Returns the identifier of this Thread.
        System.out.println("ID of this thread: " + getId());

        // Returns this thread’s priority.
        System.out.println("Priority of this thread: " + getPriority());

        // Returns the state of this thread
        System.out.println("State of this thread: " + getState());

        // Changes the name of this thread to be equal to the argument name.
        setName("Kritika");
        System.out.println("Now the name of this thread: " + getName());

        // Changes the priority of this thread.
        setPriority(MAX_PRIORITY);
        System.out.println("Now the priority of this thread: " + getPriority());

        /*
         * Returns a string representation of this thread, including the thread’s name,
         * priority, and thread group
         */
        System.out.println("Data about this thread: " + toString());
    }

    public void run() {

        int i = 0;

        while (i < 50) {

            System.out.println("I am My Thread A");
            System.out.println("Thank you");

            i++;
        }
    }
}

class MyThreadC extends Thread {

    public void run() {

        int i = 0;

        while (i < 10) {

            System.out.println("I am My Thread C");
            System.out.println("Thank you");

            try {

                /*
                 * Causes the currently executing thread to sleep (temporarily cease execution)
                 * for the specified number of milliseconds, subject to the precision and
                 * accuracy of system timers and schedulers.
                 */
                sleep(500);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            i++;
        }
    }
}

class MyThreadB extends Thread {

    public void run() {

        int i = 0;

        while (i < 10) {

            System.out.println("I am My Thread B");
            System.out.println("Thank you");

            try {

                sleep(500);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            i++;
        }
    }
}

public class JavaCommonThreadMethods {

    public static void main(String[] args) {

        MyThread myThread = new MyThread("ThreadPratham");
        MyThreadB myThreadB = new MyThreadB();
        MyThreadC myThreadC = new MyThreadC();

        /*
         * Causes this thread to begin execution; the Java Virtual Machine calls the run
         * method of this thread.
         */
        myThread.start();

        try {

            // Waits for this thread to die.
            myThread.join();

        } catch (Exception e) {

            System.out.println(e);
        }

        myThreadC.start();

        try {

            // Interrupts this thread.
            myThreadC.interrupt();

        } catch (Exception e) {

            System.out.println();

        }

        // Tests if this thread is alive.
        System.out.println("Is the thread C alive? " + myThreadC.isAlive());

        myThreadB.start();

        /*
         * Returns an estimate of the number of active threads in the current thread’s
         * thread group and its subgroups.
         */
        System.out.println("Number of active threads are: " + Thread.activeCount());
    }
}
