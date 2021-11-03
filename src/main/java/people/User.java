package people;

import model.Book;
import people.Person;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    List<Book> borrowedBookList = new ArrayList<Book>();

    public User() {
    }

    public User(String fName, String lName, List<Book> borrowedBookList) {
        super(fName, lName);
        this.borrowedBookList = borrowedBookList;
    }

    public List<Book> getBorrowedBookList() {
        return borrowedBookList;
    }
}
