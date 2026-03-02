package demo.demo_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo_ArrayDequeue {
    public static void main(String[] args) {
        Queue<String> queue2 = new ArrayDeque<>();
        queue2.offer("one");
        queue2.offer("one2");
        queue2.offer("one3");
        queue2.offer("one4");
        queue2.offer("one5");
        System.out.println("Phần tử đầu của queue" + queue2.peek());
        System.out.println("Phần tử thứ hai của queue " + queue2.poll());
        System.out.println("Phần tử thứ ba của queue " + queue2.poll());
    }
}
