package people;

import libusertype.UserType;
import model.Book;
import model.Library;
import services.BookLender;
import services.User;

import java.util.List;

public class JnrStudent extends User implements BookLender {
    public JnrStudent() {
        super();
    }

    public JnrStudent(String fName, String lName, List<Book> borrowedBookList) {
        super(fName, lName, borrowedBookList);
        this.setRole(UserType.JNR_STUDENT);
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
