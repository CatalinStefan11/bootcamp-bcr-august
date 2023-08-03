package ro.bcr.spring_jpa._1_crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.bcr.spring_jpa.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonCrudRepository extends CrudRepository<Person, Long> {

    Optional<Person> findByName(String name);

    List<Person> findByAgeLessThan(int age);
}
