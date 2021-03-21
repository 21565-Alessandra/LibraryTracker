// STUDENT NAME: ALESSANDRA SILVA DOS REIS // STUDENT ID: 21565

package com.reis;

import java.util.LinkedList;
import java.util.Queue;

public class BookQueue {


    public static void run() {
        //Method to run the list of books ID's
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i = 101; i <= 110; i++){

            myQueue.add(i);
        }

        System.out.println(" ");

        System.out.println("Books queued by ID: " + myQueue);

        //to remove one book from the list
        int removeBook = myQueue.remove();

        System.out.println("Book withdrawn from the library: " + removeBook);
        System.out.println("Books available by ID: " + myQueue);

        //to show the first number of the queue
        int head = myQueue.peek();
        System.out.println("Head of Queue: " + head);

        //to show the size of the queue
        int size = myQueue.size();
        System.out.println("Total of books available: " + size);

    }
}
