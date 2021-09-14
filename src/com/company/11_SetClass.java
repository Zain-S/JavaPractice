package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

class SetClass {
    void iterator(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using the next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.print("Updated ArrayList: ");

        // Using the hasNext() method
        while(iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
    void listIterator(){
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();

        // Using the nextIndex()
        int index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1);

        // Using the next() method
        int number1 = iterate.next();
        System.out.println("Next Element: " + number1);

        // Using the nextIndex()
        index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1);

        // Using the hasNext() method
        System.out.println("Is there any next element? " + iterate.hasNext());

        // Using the previousIndex()
        index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1);

        // Using the previous() method
        number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);
    }
}
class Algorithms{
    //Sorting Using sort()
    void sorting(){
        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);
        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
    }

    //Shuffling Using shuffle()
    void shuffle(){
        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);
    }

    //More Data manipulations
    void dataManipulations(){
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        // Using reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        // Using swap()
        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        // Using addAll
        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);

        // Using fill()
        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers);

        // Using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);
    }

    //Searching Using binarySearch()
    void binarySearch(){
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        // Using binarySearch()
        Collections.sort(numbers);
        int pos = Collections.binarySearch(numbers, 3);
        System.out.println("The position of 3 is " + pos);
    }

    //Frequency & Disjoint
    void frequencyAndDisjoint(){
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        System.out.println("ArrayList1: " + numbers);

        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
        System.out.println("ArrayList2: " + newNumbers);

        boolean value = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + value);
    }

    //Min Max Values
    void minMaxValues(){
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}