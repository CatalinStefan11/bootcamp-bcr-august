package ro.bcr.advanced._5_lambda._1_why;

@FunctionalInterface
public interface Cleanable {
    void clean();

    default void defaultMethod(){
        System.out.println("This is a default method");
    }

    static void staticMethod(){
        System.out.println("This is a static method");
    }
}
