package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book, book2;


    @BeforeEach
    void setUp() {
        book = new Book("How to Program in Java", "Dietel", "1234RNN5");
        book2 = new Book();
    }

    @DisplayName("This should test all public fields in Book Class")
    @Test
    void test_Book_Fields_Are_St() {
        assertAll(() -> {
            assertEquals("How to Program in Java", book.getTitle(), "should equal 'introduction to chemistry'");
            assertEquals("Dietel", book.getAuthor());
            assertNotNull(book2.getTitle());
            assertNotNull(book2.getAuthor());
            assertEquals("1234RNN5", book.getBookCode());
            assertNotEquals("", book.getTitle());
            assertNotEquals("introduction to Chemistry", book.getTitle());
        });
    }
}