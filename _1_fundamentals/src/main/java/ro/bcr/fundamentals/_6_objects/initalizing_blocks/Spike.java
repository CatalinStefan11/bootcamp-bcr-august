package ro.bcr.fundamentals._6_objects.initalizing_blocks;

public class Spike {

    // static stuff
    public static int variable = 10;

    // instance stuff
    private String name;


    static {
        System.out.println("1st static block");
        System.out.println("Static variable: " + variable++);
        // instance variable is not available here
//        System.out.println(name);
    }

    static {
        System.out.println("2nd static block");
        System.out.println("Static variable: " + variable++);
    }

    {
        System.out.println("1st instance initializing");
        System.out.println(name);
    }

    {
        System.out.println("2nd instance initializing");
    }



    public Spike(String name) {
        this.name = name;
    }
}
