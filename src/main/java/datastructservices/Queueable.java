package datastructservices;

public interface Queueable<T> {
    int size();
    void add(T value);
    T element();
     boolean offer(T value);
    T peek();
    T pool();
    T remove();
}
