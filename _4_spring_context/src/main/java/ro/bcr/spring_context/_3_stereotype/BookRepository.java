package ro.bcr.spring_context._3_stereotype;

import org.springframework.stereotype.Repository;

// repository is a stereotype annotation which tells
// spring that this class should be managed by it
// (added to IoC/AppContext)
// repository is the layer that interacts with the database
@Repository
public class BookRepository {

    public void saveToDatabase(String book){
        System.out.println("Book " + book  + " saved to database");
    }
}
