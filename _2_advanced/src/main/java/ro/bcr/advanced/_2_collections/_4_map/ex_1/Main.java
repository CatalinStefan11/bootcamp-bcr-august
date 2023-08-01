package ro.bcr.advanced._2_collections._4_map.ex_1;

public class Main {

    public static void main(String[] args) {

        Course c1 = new Course("Science", "Mr Smith", 3);
        Course c2 = new Course("Math", "Ionescu", 2);
        Course c3 = new Course("Physics", "Jonson", 2);
        Course c4 = new Course("Science", "Mr Smith", 3);

        University uni = new University("Oxford");

        uni.registerStudent(c1, new Student("Bob", 27));
        uni.registerStudent(c2, new Student("Math", 27));

        uni.registerStudent(c1, new Student("Alice", 27));
        uni.registerStudent(c2, new Student("Alice", 27));

        uni.registerStudent(c3, new Student("Charlie", 30));
        uni.registerStudent(c2, new Student("Charlie", 30));

        uni.registerStudent(c4, new Student("Cristiano", 23));

        uni.printCoursesAndStudents();
    }
}
