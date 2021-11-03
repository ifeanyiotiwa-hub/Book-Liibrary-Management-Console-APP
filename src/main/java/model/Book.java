package model;

import java.io.Serializable;
import java.util.Objects;

public class Book<T> implements Serializable {
    private String title, author, bookCode;
    private int quantity;

    public Book(String title, String author, String bookCode){

        this.bookCode = bookCode;
        this.author = author;
        this.title = title;
    }

    public Book() {
        this("", "", "");
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookCode());
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author +
                "\nISBN: " + bookCode +
                "\nQuantity: " + quantity + "\n";
    }
}
