package com.webservice.java.collection;

import java.util.*;

public class InterfaceQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(2);
        // Lấy phần tử ra khỏi hàng đợi và in ra
        while (!queue.isEmpty()) {
            int element = queue.poll(); // Lấy phần tử đầu tiên ra khỏi hàng đợi
            System.out.println("Element: " + element);
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
    }
}
