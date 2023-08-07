package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishOrder = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        // Initialize the queue with dish numbers from 1 to numberOfDishes
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            // Eat everyDishNumberToEat - 1 dishes
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                queue.add(queue.poll());
            }

            // Eat the everyDishNumberToEat-th dish and remove it from the queue
            dishOrder.add(queue.poll());
        }

        return dishOrder;
    }
}
