package ro.bcr.fundamentals._2_conditionals;

public class DemoSwitch {

    public static void main(String[] args) {

        int option = 2;

        switch (option){
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }

    public String functionalSwitch(int input){
        return switch (input){
            case 1 -> "First";
            case 2 -> "Second";
            case 3 -> "Third";
            default -> "Other";
        };
    }

}
