package ro.bcr.jdbc;

import java.time.LocalDate;
import java.util.Optional;

public class Demo {

    public static void main(String[] args) {

        BookJdbcPostgresDao dao = new BookJdbcPostgresDao();

        dao.create(new Book("title 1", "author 1 ", LocalDate.now()));
        dao.create(new Book("title 2", "author 2", LocalDate.now()));
        dao.create(new Book("title 3", "author 3", LocalDate.now()));

        dao.findAll().forEach(System.out::println);

        Optional<Book> optional = dao.findById(3L);

        System.out.println("-------------------");

        optional.ifPresent(System.out::println);

    }
}
