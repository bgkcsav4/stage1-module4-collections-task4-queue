package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        int everyDishNumberToEat = 2; // Set the number of dishes to eat in each turn

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat; i++) {
                if (!firstQueue.isEmpty()) {
                    arrayDeque.add(firstQueue.poll());
                }
                if (!secondQueue.isEmpty()) {
                    arrayDeque.add(secondQueue.poll());
                }
            }
        }

        // Add any remaining dishes from the firstQueue
        while (!firstQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll());
        }

        // Add any remaining dishes from the secondQueue
        while (!secondQueue.isEmpty()) {
            arrayDeque.add(secondQueue.poll());
        }

        return arrayDeque;
    }
}

