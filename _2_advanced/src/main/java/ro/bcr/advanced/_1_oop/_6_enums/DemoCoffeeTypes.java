package ro.bcr.advanced._1_oop._6_enums;

public class DemoCoffeeTypes {

    public static void main(String[] args) {

        CoffeeTypes c1 = CoffeeTypes.AMERICANO;

        System.out.println(c1.name() + "-" + c1.toString());

        String input = "LATTE";

        CoffeeTypes c2 = CoffeeTypes.valueOf(input);

        System.out.println(c2.name());
        System.out.println(c2.getPrice());
        System.out.println(c2.getDescription());


        CoffeeTypes c3 = CoffeeTypes.ESPRESSO;

        c3.setDescription("a new description");
        c3.setPrice(100);

        System.out.println(c3.toString());

    }

}
