import datastruct.ListPriorityQueue;
import datastruct.ListQueue;
import datastructservices.Queueable;
import model.Book;
import model.Library;
import people.*;

import java.io.*;
import java.util.*;

public class LibrarySystemDemo {
    private static String filename = "resources/bookFile.txt";
    private static Library libSystem = new Library();
    private static  Scanner scan = new Scanner(System.in);
    private static boolean isRunning = true;
    private static Queueable<Person> normalqueue = new ListQueue<>();
    private static ListPriorityQueue<Person> priorityQueue = new ListPriorityQueue<>();


    public static void main(String[] args) {
        System.out.println("Loading Books into Library BookShelf");
        System.out.println("====================================");

        loadScript();
        printBookShelf();

        loadLibraryUsers();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("List of user that requested for \n\n" + Library.Librarian.getBookShelf().get(0));
        System.out.println("========================================================");
        System.out.println("\t\t\tNORMAL QUEUE IMPLEMENTATION");
        System.out.println("\nBook would be given in this order For Normal Queue\n");
        System.out.println("========================================================");
        System.out.println(normalqueue.toString());


        System.out.println("List of user that requested for \n\n" + Library.Librarian.getBookShelf().get(3));
        System.out.println("========================================================");
        System.out.println("\t\t\tPRIORITY QUEUE IMPLEMENTATION");
        System.out.println("\nBook would be given in this order For Priority Queue\n");
        System.out.println("========================================================");

//        List<User> l = new ArrayList<User>((Collection<? extends User>) priorityQueue);
//        System.out.println(l);

    }

    private static void loadLibraryUsers() {
        Person user1 = new Teacher("Tenry1", "Opbi");
        normalqueue.add(user1);
        priorityQueue.add(user1);

        Person user2 = new SnrStudent("Senry1", "Fanbi");
        normalqueue.add(user2);
        priorityQueue.add(user2);
        Person user3 = new JnrStudent("Jenry1", "Throbi");
        normalqueue.add(user3);
        priorityQueue.add(user3);
        Person user4 = new Teacher("Tenry2", "Mebi");
        normalqueue.add(user4);
        priorityQueue.add(user4);
        Person user5 = new SnrStudent("Senry2", "Pebi");
        normalqueue.add(user5);
        priorityQueue.add(user5);
        Person user6 = new JnrStudent("Jenry2", "Tobi");
        normalqueue.add(user6);
        priorityQueue.add(user6);
        Person user7 = new JnrStudent("Jenry3", "Sobi");
        normalqueue.add(user7);
        priorityQueue.add(user7);
        Person user8 = new JnrStudent("Jenry4", "Mobi");
        normalqueue.add(user8);
        priorityQueue.add(user8);
        Person user9 = new Teacher("Tenry3", "Nobi");
        normalqueue.add(user9);
        priorityQueue.add(user9);
        Person user10 = new SnrStudent("Senry3", "Pobi");
        normalqueue.add(user10);
        priorityQueue.add(user10);
        Person user11 = new JnrStudent("Jenry5", "Tobi");
        normalqueue.add(user11);
        priorityQueue.add(user11);




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
