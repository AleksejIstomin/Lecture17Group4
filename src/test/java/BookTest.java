import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest {

    @Test
    public void bookTest1(){
        Book bookMainigais = new Book();

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
}
