package com.swap;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stack implements Iterable<Integer> {
    private int top;
    private int capacity;
    private int array[];


    Stack(int capacity) {
        this.array = new int[capacity];
        top = -1;
        this.capacity = capacity;

    }

    public void push(int item) {

        array[++top]=item;
    }

    public int pop(){

        return array[top--];
    }

    public int peek(){

        return array[top];
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {

                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }

    @Override
    public void forEach(Consumer consumer) {
        Iterable.super.forEach(consumer);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
