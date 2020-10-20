package com.poo;

import java.util.ArrayList;

public class Queue {
    private ArrayList queue;

    public Queue() {
        queue = new ArrayList();
    }

    public void push(Object element) {
        queue.add(element);
    }

    public Object pop() {
        return queue.remove(queue.size());
    }
}
