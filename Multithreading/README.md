# Multithreading in Java

This section explores the concepts of multithreading in Java, enabling concurrent execution of two or more threads for maximum utilization of CPU resources. Multithreading allows for efficient execution of multiple tasks simultaneously, improving the performance of applications.

## Contents

1. [Basics of Multithreading](#basics-of-multithreading)
2. [Two Ways to Use Multithreading](#two-ways-to-use-multithreading)
3. [Thread Priorities](#thread-priorities)
4. [Thread States](#thread-states)
5. [Main Thread](#main-thread)
6. [Thread Methods](#thread-methods)

## Basics of Multithreading

Multithreading is a Java feature that allows concurrent execution of two or more threads. Each thread runs in parallel and has its own execution path. Multithreading is used to perform multiple tasks simultaneously, making efficient use of CPU resources.

### Key Concepts

- **Thread**: A thread is a lightweight process that runs independently within a program.
- **Concurrency**: The ability to execute multiple threads simultaneously.
- **Parallelism**: The ability to execute multiple threads at the same time on different processors.

## Two Ways to Use Multithreading

In Java, there are two primary ways to create and manage threads:

1. **Extending the `Thread` Class**
    - Create a new class that extends the `Thread` class.
    - Override the `run()` method with the code that should execute in the new thread.
    - Create an instance of the new class and call the `start()` method to begin execution.

2. **Implementing the `Runnable` Interface**
    - Create a new class that implements the `Runnable` interface.
    - Implement the `run()` method with the code that should execute in the new thread.
    - Create an instance of the `Thread` class, passing an instance of the new class to the `Thread` constructor.
    - Call the `start()` method on the `Thread` instance to begin execution.

## Thread Priorities

Java allows you to set the priority of a thread, which determines the order in which threads are scheduled for execution. Thread priorities are integers ranging from `MIN_PRIORITY` (1) to `MAX_PRIORITY` (10), with `NORM_PRIORITY` (5) as the default.

### Setting Thread Priorities

- Use the `setPriority(int priority)` method to set a thread's priority.
- Use the `getPriority()` method to retrieve a thread's current priority.

## Thread States

A thread can be in one of several states throughout its lifecycle:

1. **New**: A thread that has been created but not yet started.
2. **Runnable**: A thread that is ready to run and is waiting for CPU time.
3. **Blocked**: A thread that is blocked and waiting for a monitor lock.
4. **Waiting**: A thread that is waiting indefinitely for another thread to perform a particular action.
5. **Timed Waiting**: A thread that is waiting for another thread to perform a particular action within a specified waiting time.
6. **Terminated**: A thread that has exited or completed its execution.

## Main Thread

The main thread is the primary thread in a Java application, responsible for executing the main method. The JVM creates this thread automatically. You can obtain a reference to the main thread using the `Thread.currentThread()` method.

### Main Thread Characteristics

- Controls the execution of other threads.
- If the main thread terminates, the program will continue to run until all user threads have terminated.

## Thread Methods

Java provides several useful methods for managing and controlling threads:

- `start()`: Starts the execution of a thread.
- `run()`: Contains the code that constitutes the new thread.
- `sleep(long millis)`: Causes the currently executing thread to sleep for the specified number of milliseconds.
- `join()`: Waits for a thread to die.
- `yield()`: Causes the currently executing thread to temporarily pause and allow other threads to execute.
- `interrupt()`: Interrupts a thread.
- `isAlive()`: Tests if a thread is alive.

---

Feel free to explore the examples and explanations provided in this section to gain a deeper understanding of multithreading in Java. If you have any questions or suggestions, don't hesitate to reach out. Happy coding! 🚀
