package datastruct;

import datastructservices.Queueable;
import people.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ListQueue<T> implements Queueable<T> {
        private int size;
        private List<T> data;

    public ListQueue() {
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
    public T pool() {
        return null;
    }

    @Override
    public T remove() {
        return null;
    }
}
