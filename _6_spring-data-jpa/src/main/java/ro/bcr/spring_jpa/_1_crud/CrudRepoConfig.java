package ro.bcr.spring_jpa._1_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.bcr.spring_jpa.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Configuration
public class CrudRepoConfig {

    @Autowired
    public PersonCrudRepository personCrudRepository;

    // CommandLineRunner is an interface that is part of SpringBoot
    // and can be used to perform any necessary setup at the app start-up
    @Bean
    public CommandLineRunner runner(){
        return args -> {
            testInsertAll();
            testCrudMethods();
            System.out.println("--------");
            testFindByName();
            System.out.println("-------");
            testFindAgeLessThan();
        };
    }

    public void testInsertAll(){
        Person p = new Person("John", 30);
        Person p2 = new Person("Snow", 25);
        personCrudRepository.saveAll(Arrays.asList(p, p2));
    }

    public void testCrudMethods(){
        boolean result = personCrudRepository.existsById(1L);
        System.out.println(result);

        personCrudRepository.save(new Person("Paul", 30));

        Iterable<Person> all = personCrudRepository.findAll();
        all.forEach(System.out::println);
    }

    public void testFindByName() {
        personCrudRepository.save(new Person("Catalin", 24));
        Optional<Person> optional = personCrudRepository.findByName("Catalin");
        optional.ifPresent(System.out::println);
    }

    public void testFindAgeLessThan(){
        List<Person> personList = personCrudRepository.findByAgeLessThan(29);
        personList.forEach(System.out::println);
    }
}
