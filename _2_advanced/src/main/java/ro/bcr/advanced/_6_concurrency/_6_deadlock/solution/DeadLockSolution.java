package ro.bcr.advanced._6_concurrency._6_deadlock.solution;

import ro.bcr.advanced._6_concurrency._6_deadlock.problem.A;
import ro.bcr.advanced._6_concurrency._6_deadlock.problem.B;

public class DeadLockSolution {

    public static void main(String[] args) {
        final A a = new A();
        final B b = new B();

        Runnable block1 = () -> {

            synchronized (a) {

                // adding delay so both threads can start trying to lock resources
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // inside first synchronized block
                // (resources a is still locked by this thread)
                // first thread needs resource A and also resource B in the same time
                synchronized (b){
                    System.out.println("Inside block 1");
                }
            }
        };
        

        Runnable block2 = () -> {

            synchronized (a){

                // this thread needs resource B and also A in the same time (lock this resources)
                synchronized (b){
                    System.out.println("Inside block 2");
                }
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();
    }
}