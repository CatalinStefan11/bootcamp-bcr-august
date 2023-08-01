package ro.bcr.advanced._2_collections._7_queue;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {

        // FIRST IN - FIRST OUT (FIFO)
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("A");
        myQueue.add("D");
        myQueue.add("H");

        // method peek dose not poll the element from the queue
        System.out.println(myQueue.peek());

        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());

        System.out.println(myQueue.size());


    }

}
