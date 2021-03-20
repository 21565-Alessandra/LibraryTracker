package com.reis;

import java.util.LinkedList;
import java.util.Queue;

public class BookQueue {

    public static void main(String[] args) {

        //Queue is an interface in Java
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i = 101; i < 110; i++){

            myQueue.add(i);
        }

        System.out.println("Books on the queued by ID: " + myQueue);

        int removeBook = myQueue.remove();

        System.out.println("Book removed from the queue: " + removeBook);
        System.out.println("Books of the queue " + myQueue);

        int head = myQueue.peek();
        System.out.println("Head of Queue: " + head);

        int size = myQueue.size();
        System.out.println("Size of queue: " + size);

    }
}
