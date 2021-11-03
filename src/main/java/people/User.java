package people;

import model.Book;
import model.Library;
import people.Person;
import services.BookLender;

import java.util.ArrayList;
import java.util.List;

public class User extends Person implements BookLender {
    List<Book> borrowedBookList = new ArrayList<Book>();

    public User() {
    }

    public User(String fName, String lName) {
        super(fName, lName);
        this.borrowedBookList = borrowedBookList;
    }

    public List<Book> getBorrowedBookList() {
        return borrowedBookList;
    }

    @Override
    public void borrowBook(Book bookName) {
        if(Library.Librarian.getBookShelf().contains(bookName)){
            getBorrowedBookList().add(bookName);
            System.out.println(this.getName() + " returned " + bookName.getTitle());
        }else{
            throw new IllegalStateException("Book no Available");
        }
    }

    @Override
    public Book returnBook(Book book) {
        if (getBorrowedBookList().contains(book)){
            getBorrowedBookList().remove(book);
            Library.Librarian.getBookShelf().add(book);
            System.out.println(this.getName() + " returned " + book.getTitle());
            return book;
        }
        else{
            throw new IllegalStateException("No Such Book in user's book List");
        }
    }
}
