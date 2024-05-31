package CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JavaPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Offers or inserts the element in the PriorityQueue.
        queue.offer(4);
        queue.offer(2);
        queue.offer(5);
        queue.offer(1);
        queue.offer(3);

        // Prints the PriorityQueue.
        System.out.println(queue);

        // Polls or removes the element from the PriorityQueue.
        queue.poll();
        System.out.println(queue);

        // Prints the topmost element.
        System.out.println(queue.peek());

        // Creates a PriorityQueue with reverse order.
        PriorityQueue<Integer> queueB = new PriorityQueue<>(Comparator.reverseOrder());

        // Offers or inserts the element in the PriorityQueue.
        queueB.offer(4);
        queueB.offer(2);
        queueB.offer(5);
        queueB.offer(1);
        queueB.offer(3);

        // Prints the PriorityQueue.
        System.out.println(queueB);
    }
}
