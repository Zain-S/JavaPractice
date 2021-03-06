package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class QueueClass {
    Queue<Integer> numbers = new LinkedList<>();
    void linkedList(){
        // offer elements to the Queue
        System.out.println("Offering elements to the Queue...");
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}
class DequeClass extends QueueClass{
    // Creating Deque using the ArrayDeque class
    Deque<Integer> numbers = new ArrayDeque<>();
    void arrayDeque(){
        // Adding Elements in Deque
        System.out.println("Adding Elements in Deque...");
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);

        // Accessing elements of the Deque
        System.out.println("Accessing elements of the Deque...");
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);
        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Removing elements from the Deque
        System.out.println("Removing elements from the Deque...");
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);
        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);
        System.out.println("Updated Deque: " + numbers);
    }

    // LinkedList as Deque
    Deque<String> animals = new LinkedList<>();
    @Override
    void linkedList(){
        // Adding Elements at start in Deque
        System.out.println("Adding Elements at start in Deque...");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);
        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);
        // Adding Elements at end in Deque
        System.out.println("Adding Elements at end in Deque...");
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);
        // removing Elements at start in Deque
        System.out.println("Removing Elements at start in Deque...");
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);
        // removing Elements from end in Deque
        System.out.println("Removing Elements from end in Deque...");
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);
    }

    // ArrayDeque as a Stack
    void arrayDequeAsStack(){
        ArrayDeque<String> animals = new ArrayDeque<>();

        //Adding elements...
        System.out.println("Adding elements...");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");
        System.out.println("Stack: " + animals);

        // Accessing top element...
        System.out.println("Accessing top element...");
        String element = animals.peek();
        System.out.println("Top Element: " + element);

        //Removing Elements...
        System.out.println("Removing Elements...");
        element = animals.pop();
        System.out.println("Removed element: " + element);

        System.out.println("Stack: " + animals);
    }
}
class BlockingQueueClass extends QueueClass{
    ArrayBlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);
    LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>();
    void arrayBlockingQueue(){
        try{
            //Adding Elements is ArrayBLockingQueue...
            System.out.println("Adding Elements is ArrayBLockingQueue...");
            numbers.put(1);
            numbers.add(2);
            numbers.offer(3);
            System.out.println("BLockingQueue: " + numbers);
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
    void linkedBlockingQueue(){
        // Using add()
        animals.add("Dog");
        animals.add("Cat");

        // Using offer()
        animals.offer("Horse");
        System.out.println("LinkedBlockingQueue: " + animals);
        //same as array.....
    }
}
