package ro.bcr.advanced._2_collections._6_stack;

import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {

        // last in first out (LIFO)
        Stack<Integer> myStack = new Stack<>();

        myStack.push(5);
        myStack.push(9);
        myStack.push(4);
        myStack.push(2);

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());

        System.out.println(myStack.size());
    }

}
