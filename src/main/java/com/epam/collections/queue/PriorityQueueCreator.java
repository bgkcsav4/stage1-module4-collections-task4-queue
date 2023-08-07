package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;
public class PriorityQueueCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll()); // Player 1 takes the top card from the ArrayDeque and adds to their queue.
            arrayDeque.add(secondQueue.poll()); // Player 2 takes the top card from the ArrayDeque and adds to their queue.
            arrayDeque.add(firstQueue.poll()); // Player 1 puts two cards from the beginning of their queue into the ArrayDeque.
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(secondQueue.poll()); // Player 2 puts two cards from the beginning of their queue into the ArrayDeque.
            arrayDeque.add(secondQueue.poll());
        }

        return arrayDeque;
    }}
