package ro.bcr.advanced._1_oop._4_encapsulation;

public class Person {

    // private -> encapsulation
    private String firstName;
    private String gender;
    private int age;

    public Person(String firstName, String gender, int age) {
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 100){
            this.age = age;
        } else{
            System.out.println("Incorrect value");
        }
    }

    public void setFirstName(String firstName) {
        if(firstName != null && !firstName.isEmpty()){
            this.firstName = firstName;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
