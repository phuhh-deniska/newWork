package org.example;

public abstract class List {
    protected Object[] items;
    protected int size;

    public List() {
        this.items = new Object[10];
        this.size = 0;
    }

    public void add(Object item) {
        if (this.size == this.items.length) {
            Object[] newItems = new Object[this.items.length * 2];
            for (int i = 0; i < this.items.length; i++) {
                newItems[i] = this.items[i];
            }
            this.items = newItems;
        }
        this.items[this.size] = item;
        this.size++;
    }

    public Object remove() {
        if (size == 0) {
            throw new RuntimeException("Список пуст");
        }

        Object item = items[--size];
        items[size] = null;
        return item;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public abstract Object peek();
}

class Stack extends List {

    public void push(Object item) {
        this.add(item);
    }

    public Object pop() {
        return this.remove();
    }

    @Override
    public Object peek() {
        if (this.size == 0) {
            throw new RuntimeException("Стек пуст");
        }
        return this.items[this.size - 1];
    }
}

class Queue extends List {

    public void enqueue(Object item) {
        this.add(item);
    }

    public Object dequeue() {
        if (this.size == 0) {
            throw new RuntimeException("Очередь пуста");
        }
        Object item = this.items[0];

        for (int i = 1; i < this.size; i++) {
            this.items[i - 1] = this.items[i];
        }
        this.items[--size] = null;
        return item;
    }

    @Override
    public Object peek() {
        if (this.size == 0) {
            throw new RuntimeException("Очередь пуста");
        }
        return this.items[0];
    }

    public Object front() {
        return this.peek();
    }
}


