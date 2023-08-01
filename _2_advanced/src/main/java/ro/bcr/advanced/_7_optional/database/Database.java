package ro.bcr.advanced._7_optional.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {

    private List<Person> people = new ArrayList<>();

    public Database() {
        people.add(new Person("Alex"));
        people.add(new Person("Ana"));
    }

    public Optional<Person> findPersonByName(String name){
        return this.people.stream()
                .filter(person -> person.getName().equals(name))
                .findAny();
    }
}
