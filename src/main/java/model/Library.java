package model;

import people.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Library<Book> implements Serializable {

    private static List<String> bookShelf;


    public Library() {
        this.bookShelf = new ArrayList<>();
    }

    public Library(List<String> bookShelf) {
        this.bookShelf = bookShelf;
    }

    public void addBook(Book book) {
        bookShelf.add(String.valueOf(book));
    }

    public void removeBook(Book book) {
        if(Librarian.getBookShelf().contains(book)){
            Librarian.getBookShelf().remove(book);
        }else{
            throw new IllegalStateException("Book Not Found");
        }

    }


    @Override
    public String toString() {
        String bookList = "\n";
        Iterator<Book> bookIterator = Librarian.getBookShelf().iterator();
        for(;bookIterator.hasNext();){
            Book b = bookIterator.next();
            bookList += b.toString();
        }

        return bookList;
    }

    public static class Librarian extends Person{
        private String fName;
        private String lName;

        public Librarian() {
            this("Absent", "character");
        }

        public Librarian(String fName, String lName) {
            super(fName, lName);
            this.fName = fName;
            this.lName = lName;
        }

        public static List getBookShelf() {
            if(bookShelf.isEmpty())
                throw new IllegalStateException("No Book in Shelf");
            else
                return bookShelf;
        }

    }
}
