package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll()); // Player 1 takes the top card from the ArrayDeque and adds to their queue.
            arrayDeque.add(secondQueue.poll()); // Player 2 takes the top card from the ArrayDeque and adds to their queue.
        }

        while (!firstQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll()); // If the secondQueue is empty, Player 1 adds the remaining cards to the ArrayDeque.
        }

        while (!secondQueue.isEmpty()) {
            arrayDeque.add(secondQueue.poll()); // If the firstQueue is empty, Player 2 adds the remaining cards to the ArrayDeque.
        }

        return arrayDeque;
    }

}
