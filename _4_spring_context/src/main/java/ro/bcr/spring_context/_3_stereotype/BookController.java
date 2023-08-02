package ro.bcr.spring_context._3_stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// this is the web layer of the application
@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void post(String book){
        System.out.println("Received request");
        bookService.saveBookToDatabase(book);
    }
}
