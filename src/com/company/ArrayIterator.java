package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator <T>implements Iterator<T> {
    private final T[] array;
    private int index = 0;

    public ArrayIterator(T[] array){
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return array[index++];
    }

    public static void main(String[] args) {

    }
}
