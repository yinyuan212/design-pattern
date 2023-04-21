package com.example.designpattern.structural.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayListAdapter implements Iterable{

    Enumeration enumeration;

    public ArrayListAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void forEach(Consumer consumer) {
        enumeration.hasMoreElements();
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
