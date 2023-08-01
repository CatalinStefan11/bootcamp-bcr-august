package ro.bcr.advanced._5_lambda._6_method_reference;

import java.util.function.BiFunction;
import java.util.function.Function;

class Darius{

    static int hp = 100;

    public static int dealDamage(int attackDamage, int trueDamage){
        return attackDamage + trueDamage;
    }

    public static int healUp(int amount){
        return hp += amount;
    }
}

public class DemoStatic {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> realDamage = Darius::dealDamage;
        int result = realDamage.apply(100, 40);
        System.out.println(result);

        Function<Integer, Integer> healUp = Darius::healUp;
        result = healUp.apply(30);
        System.out.println(result);
    }

}
