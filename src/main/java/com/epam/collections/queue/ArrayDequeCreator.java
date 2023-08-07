package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll()); // Player 1 takes the top card from the ArrayDeque and adds it to their queue.
            arrayDeque.add(secondQueue.poll()); // Player 2 takes the top card from the ArrayDeque and adds it to their queue.

            // Player 1 puts two cards from the beginning of their queue into the ArrayDeque.
            if (!firstQueue.isEmpty()) {
                arrayDeque.add(firstQueue.poll());
            }
            if (!firstQueue.isEmpty()) {
                arrayDeque.add(firstQueue.poll());
            }

            // Player 2 puts two cards from the beginning of their queue into the ArrayDeque.
            if (!secondQueue.isEmpty()) {
                arrayDeque.add(secondQueue.poll());
            }
            if (!secondQueue.isEmpty()) {
                arrayDeque.add(secondQueue.poll());
            }
        }
/*
        // Add any remaining cards from the firstQueue
        while (!firstQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll());
        }

        // Add any remaining cards from the secondQueue
        while (!secondQueue.isEmpty()) {
            arrayDeque.add(secondQueue.poll());
        }
*/
        return arrayDeque;
    }
}


