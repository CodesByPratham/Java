package CollectionFramework.Queue;

import java.util.ArrayDeque;

public class JavaArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> dequeue = new ArrayDeque<>();

        // Offers or inserts the element in the ArrayDeque.
        dequeue.offer(4);
        dequeue.offer(7);
        dequeue.offer(5);

        // Offers or inserts the element at the start of ArrayDeque.
        dequeue.offerFirst(8);

        // Offers or inserts the element at the end of ArrayDeque.
        dequeue.offerLast(1);

        // By default Offers or inserts the element at the end of ArrayDeque.
        dequeue.offer(9);

        // Prints ArrayDeque
        System.out.println(dequeue);

        // Peeks and returns the first and last element of ArrayDeque.
        System.out.println(dequeue.peek());
        System.out.println(dequeue.peekFirst());
        System.out.println(dequeue.peekLast());

        // Polls or removes the first element from ArrayDeque.
        System.out.println(dequeue.poll());
        System.out.println("poll() " + dequeue);

        // Polls or removes the first element from ArrayDeque.
        System.out.println(dequeue.pollFirst());
        System.out.println("pollFirst()" + dequeue);

        // Polls or removes the last element from ArrayDeque.
        System.out.println(dequeue.pollLast());
        System.out.println("pollLast() " + dequeue);
    }
}
