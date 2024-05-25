package Multithreading;

class ThreadOne extends Thread {

    int i = 0;

    @Override
    public void run() {
        while (i < 500) {
            System.out.println("Thread one is running...");
            System.out.println("Thread ID: " + this.threadId());
            i++;
        }
    }
}

class ThreadTwo extends Thread {

    int i = 0;

    @Override
    public void run() {
        while (i < 500) {
            System.out.println("Thread Two is running...");
            System.out.println("Thread ID: " + this.threadId());
            i++;
        }
    }
}

public class JavaMultithreadingBasics {

    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
    }
}
