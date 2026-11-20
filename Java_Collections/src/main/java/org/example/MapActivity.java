package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {

        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map<String, String> employees = new HashMap<>();

        employees.put("101", "Krishna");
        employees.put("102", "Prabhu");
        employees.put("103", "John");
        employees.put("104", "Guru");

        // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
        MapActivity obj = new MapActivity();

        obj.print(employees);
    }
    void print(Map map) {

        // 3 - Type code to print this map (keys and values)
        System.out.println(map);
    }
}

