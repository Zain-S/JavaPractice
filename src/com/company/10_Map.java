package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MapInterface {
    //Implementing HashMap Class
    void hashMapClass(){
        Map<String, Integer> numbers = new HashMap<>();
        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Adding Elements in HashMap
        System.out.println("Adding Elements in HashMapc...");
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("Map: " + numbers);

        // Accessing Keys & values of the Map
        System.out.println("Keys: " + numbers.keySet());
        System.out.println("Values: " +numbers.values());
        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
    }

    // Implementing TreeMap Class
    void treeMapClass(){
        Map<String, Integer> values = new TreeMap<>();

        // Insert elements to map
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
    }
}
