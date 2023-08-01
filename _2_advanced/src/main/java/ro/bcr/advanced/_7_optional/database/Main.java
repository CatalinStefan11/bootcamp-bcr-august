package ro.bcr.advanced._7_optional.database;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();

        Optional<Person> optional = database.findPersonByName("Catalin");

        if(optional.isPresent()) {
            System.out.println("Present");
            System.out.println(optional);
        } else {
            System.out.println("Not present");
            System.out.println(optional);
        }
    }


}
