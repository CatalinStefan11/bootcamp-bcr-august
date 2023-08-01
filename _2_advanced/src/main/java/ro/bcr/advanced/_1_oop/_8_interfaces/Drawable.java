package ro.bcr.advanced._1_oop._8_interfaces;

// the interface defines a contract
public interface Drawable {
    void draw();

    default void myDefaultMethod(){
        System.out.println("Default method");
    }
}
