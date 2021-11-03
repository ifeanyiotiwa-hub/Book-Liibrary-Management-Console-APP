package people;

import libusertype.UserType;
import model.Book;
import model.Library;
import services.BookLender;

import java.util.List;

public class Teacher extends User implements BookLender {
    public Teacher() {
        super();
    }

    public Teacher(String fName, String lName) {
        super(fName, lName);
        this.setRole(UserType.TEACHER);
    }

    @Override
    public Book returnBook(Book book) {
        if (getBorrowedBookList().contains(book)){
            getBorrowedBookList().remove(book);
            Library.Librarian.getBookShelf().add(book);
            return book;
        }
        else{
            throw new IllegalStateException("No Such Book in user's book List");
        }
    }

    @Override
    public void borrowBook(Book bookName) {
        if(Library.Librarian.getBookShelf().contains(bookName)){
            getBorrowedBookList().add(bookName);
        }else{
            throw new IllegalStateException("Book no Available");
        }
    }
}