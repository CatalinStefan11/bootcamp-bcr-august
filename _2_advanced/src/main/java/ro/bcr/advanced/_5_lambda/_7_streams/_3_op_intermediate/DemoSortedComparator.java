package ro.bcr.advanced._5_lambda._7_streams._3_op_intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoSortedComparator {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("alex", 30),
                new User("dan", 25),
                new User("ana", 10),
                new User("vali", 40),
                new User("cristiana", 15)
        );

        users.stream()
                .sorted(Comparator.comparingInt(User::getAge).reversed())
                .forEach(System.out::println);
    }

    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
}
