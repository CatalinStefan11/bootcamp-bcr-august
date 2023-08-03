package ro.bcr.spring_jpa._2_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ro.bcr.spring_jpa.Person;

import java.util.List;

public interface PlayerCrudRepo extends JpaRepository<Player, Long> {

    @Query("SELECT p FROM player p WHERE p.name LIKE %:name%")
    List<Player> findByNameLike(@Param("name") String name);

    @Query("DELETE FROM player p where p.isActive = :active")
    @Modifying
    @Transactional
    int deleteByActive(@Param("active") boolean active);

}
