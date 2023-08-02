package ro.bcr.spring_context._3_stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// this is the layer where the business logic resides
@Service
public class BookService {

    // @Autowired -> field injection is not recommended
    private BookRepository repo;

    // by having the constructor spring will
    // inject the dependency here from IoC
    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public void saveBookToDatabase(String book){
        System.out.println("Saving to database");
        repo.saveToDatabase(book);
    }
}
