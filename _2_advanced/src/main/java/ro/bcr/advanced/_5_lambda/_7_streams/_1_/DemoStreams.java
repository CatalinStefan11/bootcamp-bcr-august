package ro.bcr.advanced._5_lambda._7_streams._1_;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DemoStreams {

    public static void main(String[] args) {

        oldSchool();
        System.out.println("------------");
        easyToRead();

        System.out.println("------------");
        List<String> result = oneLine();
        result.forEach(System.out::println);
    }

    public static List<String> oneLine(){
        return createLibrary().stream()
                .map(Book::getAuthor)
                .filter((author -> author.getAge() >= 43))
                .distinct()
                .limit(3)
                .map(Author::getName)
                .toList();
    }

    public static void easyToRead(){
        List<Book> books = createLibrary();

        Predicate<Author> olderThan50 = author -> author.getAge() >= 50;

        List<Author> authors = books.stream()
                .map((b) -> b.getAuthor())
                .filter(olderThan50)
                .distinct()
                .toList();

        authors.forEach(System.out::println);
    }

    public static void oldSchool(){
        List<Book> books = createLibrary();

        List<Book> result = new ArrayList<>();

        for(var b : books){
            if(b.getAuthor().getAge() > 50){
                result.add(b);
            }
        }

        result.forEach(System.out::println);
    }

    public static List<Book> createLibrary(){

        List<Book> books = new ArrayList<>();

        books.add(new Book("Karamazov brothers", new Author("Fyodor Dovstoiesky", 70)));
        books.add(new Book("The metamorphosis", new Author("Franz Kafka", 60)));
        books.add(new Book("The metamorphosis", new Author("Franz Kafka", 60)));
        books.add(new Book("Game of thrones", new Author("George Martin", 40)));
        books.add(new Book("1984", new Author("George Oewell", 46)));
        books.add(new Book("The great gatsby", new Author("F. Scott Fitzgerald", 44)));

        return books;
    }
}

