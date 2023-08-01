package ro.bcr.advanced._1_oop._2_inheritance;


public class Vehicle {
    private String brand;
    private int tankCapacity;

    public void fillTank(int amount){
        this.tankCapacity += amount;
    }

    public void drive(){
        System.out.println("just driving");
    }
}
