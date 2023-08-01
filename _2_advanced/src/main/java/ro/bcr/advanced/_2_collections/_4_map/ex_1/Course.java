package ro.bcr.advanced._2_collections._4_map.ex_1;

import java.util.Objects;

public class Course {
    private String name;
    private String instructor;
    private int capacity;

    public Course(String name, String instructor, int capacity) {
        this.name = name;
        this.instructor = instructor;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return capacity == course.capacity &&
                Objects.equals(name, course.name) &&
                Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, instructor, capacity);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", capacity=" + capacity +
                '}';
    }


}
