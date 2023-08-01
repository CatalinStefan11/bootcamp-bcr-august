package ro.bcr.advanced._1_oop._6_enums;

public class DemoDirection {

    public static void main(String[] args) {

        Direction d1 = Direction.SOUTH;

        System.out.println(d1.name());
        System.out.println(d1.ordinal());

        // case sensitive
        String input = "NORTH";
        Direction myDirection = Direction.valueOf(input);

        System.out.println(myDirection);

        System.out.println("---------------");

        Direction[] values = Direction.values();

        for(var d : values){
            System.out.println(d);
        }
    }
}
