package services;

import model.Book;

public interface BookLender<U extends User> {
    <U extends User> void borrowBook(Book bookName);

    <U extends User> Book returnBook(Book book);

}
