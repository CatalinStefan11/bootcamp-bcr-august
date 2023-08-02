package ro.bcr.jdbc;

import java.util.*;

public class BookInMemoryDao implements BookRepository {

    private Map<Long, Book> db;

    public BookInMemoryDao() {
        this.db = new HashMap<>();
    }

    @Override
    public Book create(Book book) {
        long nextId = db.size() + 1;
        book.setId(nextId);
        db.put(nextId, book);
        return db.get(nextId);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(db.values());
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return db.values().stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(db.get(id));
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        return db.values().stream()
                .filter(book -> book.getTitle().equals(title))
                .findAny();
    }

    @Override
    public Book update(Long id, Book book) {
        Book bookToUpdate = db.get(id);

        if(bookToUpdate != null){
            bookToUpdate.setAuthor(book.getAuthor());
            bookToUpdate.setPublishedDate(book.getPublishedDate());
            bookToUpdate.setTitle(book.getTitle());
            return bookToUpdate;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        db.remove(id);
    }
}
