package com.company;

import java.util.*;

class ListClass {
    void arrayListEx1(){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayList: " + animals);
        System.out.println(animals.contains("Dog"));
    }

//    Add Elements to an ArrayList
    void arrayListEx2(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);
        //Access ArrayList Elements
        System.out.println("Accessing ArrayList Elements...");
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);
        //Remove ArrayList Elements
        System.out.println("Removing ArrayList Elements...");
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("List: " + numbers);
        //Change ArrayList Elements
        System.out.println("Changing ArrayList Elements...");
        numbers.set(1, 2);
        System.out.println("Modified ArrayList: " + numbers);
    }
    //ArrayList to Array
    void arrayListToArray() {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);
        String[] arr = new String[languages.size()];
        languages.toArray(arr);
        System.out.print("Array: ");
        for (String item : arr) {
            System.out.print(item + ", ");
        }
    }
    //Convert Array to ArrayList
    void arrayToArrayList(){
        String[] arr = { "Java", "Python", "C++" };
        System.out.print("Array: ");
        for (String str : arr) {
            System.out.print(str);
            System.out.print(" ");
        }
        ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\nArrayList: " + languages);
    }
    //Create and initialize arrayList in single line
    void arrayListSingleLine(){
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "C++", "Python"));
        System.out.println(languages);
    }


    List<Integer> linkedList(){
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("List: " + numbers);
        return numbers;
    }
    void LinkedListUsingIterator() {
        Iterator<Integer> iterate = linkedList().iterator();
        System.out.print("ArrayList: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }

    //Vectors (ArrayList>Vector)
    void vectors(){
        Vector<String> mammals= new Vector<>();
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");
        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }

    //Stack
    void stack(){
        Stack<String> animals= new Stack<>();

        //Pushing in Stack
        System.out.println("Pushing in Stack...");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        //Popping from Stack
        System.out.println("Popping from Stack...");
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        System.out.println("Stack: " + animals);

        //Peeking in Stack
        System.out.println("Peeking in Stack...");
        element = animals.peek();
        System.out.println("Element at top: " + element);

        //Searching element Position
        System.out.println("Searching element Position...");
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
        position = animals.search("Dog");
        System.out.println("Position of Dog: " + position);

        //Pushing in Stack
        System.out.println("Pushing in Stack...");
        animals.push("Cat");

        //Searching element Position
        System.out.println("Searching element Position...");
        position = animals.search("Cat");
        System.out.println("Position of Cat: " + position);
        System.out.println("Stack: " + animals);

        //Checking if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
