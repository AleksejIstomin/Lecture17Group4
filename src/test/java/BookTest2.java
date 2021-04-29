import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest2 {
    Book bookMainigais = new Book();

    @Before
    public void setUp(){
        bookMainigais.setBookName("White Fang");
        bookMainigais.setIsbn("Eng-Kaut-1234567890");
        bookMainigais.setGenre("Adventure");
        bookMainigais.setYear(1906);
        bookMainigais.setAuthor("Jack London");
    }
    @Test
    public void bookTest1() {
        bookMainigais.setBookName("White Fang");
        bookMainigais.setIsbn("Eng-Kaut-1234567890");
        bookMainigais.setGenre("Adventure");
        bookMainigais.setYear(1906);
        bookMainigais.setAuthor("Jack London");

        assertThat(bookMainigais.getBookName()).isEqualTo("White Fang");
        assertThat(bookMainigais.getIsbn()).isEqualTo("Eng-Kaut-1234567890");
        assertThat(bookMainigais.getGenre()).isEqualTo("Adventure");
        assertThat(bookMainigais.getYear()).isEqualTo(1906);
        assertThat(bookMainigais.getAuthor()).isEqualTo("Jack London");
    }
    @After
    public void tearDown(){
        bookMainigais = null;

    }
}
