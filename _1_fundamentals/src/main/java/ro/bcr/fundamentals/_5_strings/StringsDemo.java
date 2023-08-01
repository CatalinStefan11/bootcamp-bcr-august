package ro.bcr.fundamentals._5_strings;

public class StringsDemo {

    public static void main(String[] args) {

        String title = "Harry potter";

        title = title.concat(" abc");

        System.out.println(title);

        System.out.println("--------------");

        String anotherTitle = "Game of thrones";

        // string is internalized in string pool
        String other = "Game of thrones";

        // == operators checks the reference equality
        System.out.println(anotherTitle == other);
        System.out.println(anotherTitle.equals(other));

    }
}
