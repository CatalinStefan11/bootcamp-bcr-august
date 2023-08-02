package ro.bcr.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookJdbcPostgresDao implements BookRepository {

    private static final String URL = "jdbc:postgresql://localhost:5432/jdbc_exercises";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "pass";


    @Override
    public Book create(Book book) {
        String query = "INSERT INTO book (title, author, published_date) VALUES(?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            // precompiled statement that is cached and improves performance and the speed of repetitive queries
            // helps us to avoid sql injection
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setDate(3, Date.valueOf(book.getPublishedDate()));

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Insert failed, no rows affected");
            }

            try (ResultSet resultSet = statement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    book.setId(resultSet.getLong(1));
                } else {
                    throw new SQLException("Failed to get generated id");
                }
            }
            ;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        ;

        return book;
    }

    @Override
    public List<Book> findAll() {
        List<Book> result = new ArrayList<>();

        String query = "SELECT * FROM book";

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Book b = new Book();
                b.setId(resultSet.getLong(1));
                b.setTitle(resultSet.getString(2));
                b.setAuthor(resultSet.getString(3));
                b.setPublishedDate(resultSet.getDate(4).toLocalDate());
                result.add(b);
            }

        } catch (SQLException t) {
            t.printStackTrace();
        }

        return result;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        // todo
        return null;
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        String query = "SELECT * FROM book WHERE title = ?";
        Book result = null;

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, title);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                result = new Book();
                result.setId(resultSet.getLong(1));
                result.setTitle(resultSet.getString(2));
                result.setAuthor(resultSet.getString(3));
                result.setPublishedDate(resultSet.getDate(4).toLocalDate());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.ofNullable(result);
    }

    @Override
    public Optional<Book> findById(Long id) {
        String query = "SELECT * FROM book WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(query);

            Book result = null;

            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                result = new Book(resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4).toLocalDate()
                );
            }

            return Optional.ofNullable(result);
        } catch (SQLException t) {
            t.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Book update(Long id, Book book) {
        String query = "UPDATE book SET title = ?, author = ?, publish_date = ?  WHERE id = ?";
        Book result = null;

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setDate(3, Date.valueOf(book.getPublishedDate()));
            statement.setLong(4, id);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Update failed, no rows affected.");
            } else {
                result = book;
                return result;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public void delete(Long id) {
        String query = "DELETE FROM book WHERE id = ? ; ";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            statement.setLong(1, id);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Delete failed, no rows affected.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
