package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

    public class ArrayDequeCreator {
        public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
            ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

            while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
                firstQueue.add(arrayDeque.poll());
                secondQueue.add(arrayDeque.poll());
                // Player 1 puts two cards from the beginning of their queue into the ArrayDeque.
                if (!firstQueue.isEmpty()) {
                    arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
                }
                if (!firstQueue.isEmpty()) {
                    arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
                }

                // Player 2 puts two cards from the beginning of their queue into the ArrayDeque.
                if (!secondQueue.isEmpty()) {
                    arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
                }
                if (!secondQueue.isEmpty()) {
                    arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
                }
            }

            return arrayDeque;
        }
    }



