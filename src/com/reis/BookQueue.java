package com.reis;

import java.util.LinkedList;
import java.util.Queue;

public class BookQueue {

    public static void main(String[] args) {

        Queue<Integer> myQueue = new LinkedList<>();

        for (int i = 101; i <= 110; i++){

            myQueue.add(i);
        }

        System.out.println("Books queued by ID: " + myQueue);

        int removeBook = myQueue.remove();

        System.out.println("Book withdrawn from the library: " + removeBook);
        System.out.println("Books available by ID: " + myQueue);

        int head = myQueue.peek();
        System.out.println("Head of Queue: " + head);

        int size = myQueue.size();
        System.out.println("Total of books available: " + size);

    }
}
