package ro.bcr.advanced._8_tdd.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {
    List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    // deep copy of the list
//    public List<Book> findAll(){
//        return new ArrayList<>(books);
//    }

    // unmodifiable list throws UnsupportedOperationException
    // when trying to add/remove elements from the list
    public List<Book> findAll() {
        return Collections.unmodifiableList(books);
    }

    public void clear() {
        books.clear();
    }

    public int sumPrices() {
        return books.stream().mapToInt(Book::getPrice).sum();
    }

}
