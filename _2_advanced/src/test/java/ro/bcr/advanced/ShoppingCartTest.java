package ro.bcr.advanced;

import org.junit.jupiter.api.Test;
import ro.bcr.advanced._8_tdd.shop.Basket;
import ro.bcr.advanced._8_tdd.shop.Book;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShoppingCartTest {

    @Test
    void givenBook_whenAdd_thenReturnBook(){
        // given -> initial statements / assumptions
        Basket basket = new Basket();
        Book book = new Book("Harry potter", "J.K. Rollings", 20);

        // when -> an action happens
        basket.addBook(book);

        // then -> expected behaviour
        Book returned = basket.findAll().get(0);
        assertThat(basket.findAll().size()).isEqualTo(1);
        assertThat(returned.getTitle()).isEqualTo(book.getTitle());
        assertThat(returned.getAuthor()).isEqualTo(book.getAuthor());
        assertThat(returned.getPrice()).isEqualTo(book.getPrice());
    }

    @Test
    void givenBook_whenClear_thenBasketShouldBeEmpty(){
        // given
        Basket basket = new Basket();
        Book book = new Book("Harry potter", "J.K. Rollings", 20);
        basket.addBook(book);

        // when
        basket.clear();

        assertThat(basket.findAll().size()).isZero();
    }

    @Test
    void giveBooks_whenSumPrices_thenReturnCorrectSummedPrice(){
        // given
        Basket basket = new Basket();
        Book book = new Book("Harry potter", "J.K. Rollings", 40);
        Book book2 = new Book("Games of thrones", "George martin", 15);
        basket.addBook(book);
        basket.addBook(book2);

        // when
        int actualPrice = basket.sumPrices();

        assertThat(actualPrice).isEqualTo(55);
    }

}
