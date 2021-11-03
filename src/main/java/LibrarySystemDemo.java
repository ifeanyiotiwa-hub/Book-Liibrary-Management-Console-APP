import datastruct.ListQueue;
import datastructservices.Queueable;
import model.Book;
import model.Library;
import people.Person;
import people.Teacher;
import people.User;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class LibrarySystemDemo {
    private static String filename = "resources/bookFile.txt";
    private static Library libSystem = new Library();
    private static  Scanner scan = new Scanner(System.in);
    private static boolean isRunning = true;
    private static Queueable<? extends User> normalqueue = new ListQueue<>();


    public static void main(String[] args) {
        System.out.println("Loading Books into Library BookShelf");
        System.out.println("====================================");

        loadScript();
        printBookShelf();

        loadLibraryUsers();

    }

    private static void loadLibraryUsers() {
        Person user1 = new Teacher("Henry", "Obi");
        Person user2 = new Teacher("Henry", "Obi");
        Person user3 = new Teacher("Henry", "Obi");
        Person user4 = new Teacher("Henry", "Obi");
        Person user5 = new Teacher("Henry", "Obi");
        Person user6 = new Teacher("Henry", "Obi");
        Person user7 = new Teacher("Henry", "Obi");
        Person user8 = new Teacher("Henry", "Obi");
        Person user9 = new Teacher("Henry", "Obi");
        Person user10 = new Teacher("Henry", "Obi");
        Person user11 = new Teacher("Henry", "Obi");



    }

    private static void printBookShelf() {
        Iterator<String> bookIterator = Library.Librarian.getBookShelf().iterator();
        while(bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }

    private static void loadScript() {
        Book book1 = new Book("Elements Of Maths", "Author A", "122SW");
        libSystem.addBook(book1);
        Book book2 = new Book("How to Program in C", "Author B", "123SW");
        libSystem.addBook(book2);
        Book book3 = new Book("How To Program in Java", "Author C", "124SW");
        libSystem.addBook(book3);
        Book book4 = new Book("Java for Problem Solving", "Author D", "125SW");
        libSystem.addBook(book4);
        Book book5 = new Book("The Pragmatic Programmer", "Author E", "126SW");
        libSystem.addBook(book5);
        Book book6 = new Book("Element of Critical Reasoning", "Author M", "127SW");
        libSystem.addBook(book6);
        Book book7 = new Book("Thinking in Java", "Author W", "128SW");
        libSystem.addBook(book7);
        Book book8 = new Book("Java Generics", "Author X", "129SW");
        libSystem.addBook(book8);
        Book book9 = new Book("Java for Maths", "Author J", "130SW");
        libSystem.addBook(book9);
        Book book10 = new Book("Dynamic Programming", "Author L", "131SW");
        libSystem.addBook(book10);

    }
}
