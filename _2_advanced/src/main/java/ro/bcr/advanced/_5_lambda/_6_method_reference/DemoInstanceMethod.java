package ro.bcr.advanced._5_lambda._6_method_reference;

interface Jungler{
    void gank();
}

class Elise{
    public void stun(){
        System.out.println("Elise stun");
    }
}

public class DemoInstanceMethod {
    public static void main(String[] args) {

        Elise elise = new Elise();

        Jungler jungler = () -> elise.stun();

        Jungler methodReference = elise::stun;

        methodReference.gank();


    }
}
