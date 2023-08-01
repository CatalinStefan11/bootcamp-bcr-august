package ro.bcr.advanced._2_collections._4_map.ex_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private String name;
    private Map<Course, List<Student>> courseMap;

    public University(String name) {
        this.name = name;
        this.courseMap = new HashMap<>();
    }

    public boolean registerStudent(Course c, Student s){
        if(courseMap.containsKey(c)){
            List<Student> students = courseMap.get(c);
            if(students.size() < c.getCapacity()){
                students.add(s);
                return true;
            }
        } else{
            List<Student> students = new ArrayList<>();
            students.add(s);
            courseMap.put(c, students);
            return true;
        }
        return false;
    }

    public void printCoursesAndStudents(){
        for(var pair : courseMap.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
