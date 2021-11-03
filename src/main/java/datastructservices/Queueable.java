package datastructservices;

import java.util.List;


public interface Queueable<T> {
    int size();
    void add(T value);
    T element();
     boolean offer(T value);
    T peek();
    T poll();
    T remove();

    List<T> getData();
}
