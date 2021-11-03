package datastruct;

import datastructservices.Queueable;
import people.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPriorityQueue<T> implements Queueable<T>, Comparator<Person> {
    private int size;
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public ListPriorityQueue() {
        this.size = size;
        this.data = new ArrayList<T>();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T value) {
        data.add(value);
        size++;
    }

    @Override
    public T element() {
        return data.get(0);
    }

    @Override
    public boolean offer(T value) {
        data.add(value);
        return true;
    }

    @Override
    public T peek() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        else {
            return data.get(0);
        }
    }

    @Override
    public T poll() {
        if(data.isEmpty()){
            throw new NullPointerException("Queue is empty");
        }
        else{
            size--;
            return data.remove(0);
        }
    }

    @Override
    public T remove() {
        if(data.isEmpty()){
            throw new IndexOutOfBoundsException("Cannot remove element because queue is empty");
        }
        size--;
        return data.remove(0);
    }



    @Override
    public String toString() {
        System.out.println("\nCurrent Priority Queue\n" +
                "List: \n");
        for(int i = 0; i < data.size(); i++)
            System.out.println(data.get(i).toString());
        return "\n";
    }
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getRole().getQueuePrecedence() > o2.getRole().getQueuePrecedence())
            return 1;
        else if(o1.getRole().getQueuePrecedence() == o2.getRole().getQueuePrecedence())
            return 0;
        else if(o1.getRole().getQueuePrecedence() < o2.getRole().getQueuePrecedence())
            return -1;
        else
            throw new IllegalStateException("Not a valid User Type");
    }
}

