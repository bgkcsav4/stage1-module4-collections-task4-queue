package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

    public class ArrayDequeCreator {
        public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
            ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

            while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
                firstQueue.add(arrayDeque.poll());
                secondQueue.add(arrayDeque.poll());

                // Player 1 puts two cards from the beginning of their queue into the ArrayDeque.
                arrayDeque.add(firstQueue.poll());
                arrayDeque.add(firstQueue.poll());

                // Player 2 puts two cards from the beginning of their queue into the ArrayDeque.
                arrayDeque.add(secondQueue.poll());
                arrayDeque.add(secondQueue.poll());
            }

            return arrayDeque;
        }
    }



