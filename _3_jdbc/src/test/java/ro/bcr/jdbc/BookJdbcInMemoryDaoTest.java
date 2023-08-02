package ro.bcr.jdbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


public class BookJdbcInMemoryDaoTest {

    private BookInMemoryDao bookDao;

    @BeforeEach
    public void setUp() {
        bookDao = new BookInMemoryDao();
    }

    @Test
    public void testCreate() {
        Book book = new Book(1L, "Title 1", "Author 1", LocalDate.now());
        Book createdBook = bookDao.create(book);

        assertNotNull(createdBook.getId());
        assertEquals(book.getTitle(), createdBook.getTitle());
        assertEquals(book.getAuthor(), createdBook.getAuthor());
        assertEquals(book.getPublishedDate(), createdBook.getPublishedDate());
    }

    @Test
    public void testFindAll() {
        Book book1 = new Book( 1L, "Title 1", "Author 1", LocalDate.now());
        Book book2 = new Book(2L, "Title 2", "Author 2", LocalDate.now());
        bookDao.create(book1);
        bookDao.create(book2);

        List<Book> allBooks = bookDao.findAll();

        assertEquals(2, allBooks.size());
        assertTrue(allBooks.contains(book1));
        assertTrue(allBooks.contains(book2));
    }

    @Test
    public void testFindById() {
        Book book = new Book( 1L, "Title 1", "Author 1", LocalDate.now());
        Book createdBook = bookDao.create(book);

        Optional<Book> foundBook = bookDao.findById(createdBook.getId());

        assertTrue(foundBook.isPresent());
        assertEquals(book, foundBook.get());
    }

    @Test
    public void testFindByTitle() {
        Book book = new Book( 1L, "Title 1", "Author 1", LocalDate.now());
        bookDao.create(book);

        Optional<Book> foundBook = bookDao.findByTitle("Title 1");

        assertTrue(foundBook.isPresent());
        assertEquals(book, foundBook.get());
    }

    @Test
    public void testUpdate() {
        Book book = new Book( 1L, "Title 1", "Author 1", LocalDate.now());
        Book createdBook = bookDao.create(book);

        Book updatedBook = new Book(1L, "Updated Title", "Updated Author", LocalDate.now());
        bookDao.update(createdBook.getId(), updatedBook);

        Optional<Book> foundBook = bookDao.findById(createdBook.getId());
        assertTrue(foundBook.isPresent());
        assertEquals(createdBook.getId(), foundBook.get().getId());
        assertEquals(updatedBook.getTitle(), foundBook.get().getTitle());
        assertEquals(updatedBook.getAuthor(), foundBook.get().getAuthor());
        assertEquals(updatedBook.getPublishedDate(), foundBook.get().getPublishedDate());
    }

    @Test
    public void testDelete() {
        Book book = new Book( 1L, "Title 1", "Author 1", LocalDate.now());
        Book createdBook = bookDao.create(book);

        bookDao.delete(createdBook.getId());

        List<Book> allBooks = bookDao.findAll();
        assertEquals(0, allBooks.size());
    }
}
