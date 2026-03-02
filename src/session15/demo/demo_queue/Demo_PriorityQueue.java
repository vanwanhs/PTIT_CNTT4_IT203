package demo.demo_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);
        System.out.println("phần tử đầu của queue: " + queue1.peek());
        System.out.println("Phần tử thứ nhất của queue " + queue1.poll());
        System.out.println("Phần tử thứ hai của queue " + queue1.poll());
    }
}
