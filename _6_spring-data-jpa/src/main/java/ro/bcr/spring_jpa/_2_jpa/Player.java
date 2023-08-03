package ro.bcr.spring_jpa._2_jpa;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Table
@Entity(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int age;
    private ZonedDateTime birthDate;
    private boolean isActive;

    public Player() {
    }

    public Player(long id, String name, int age, ZonedDateTime birthDate, boolean isActive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ZonedDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(ZonedDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
