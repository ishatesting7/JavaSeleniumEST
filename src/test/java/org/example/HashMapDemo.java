package org.example;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String args[])
    {
        HashMap<Integer, String> testData = new HashMap<>();

        testData.put(1, "Hashmap");

        testData.put(2, "Orange");

        testData.put(4,"Third Value");

        testData.put(4,"Third Value");

        testData.put(7,"Third Value+8888");

        System.out.println(testData);

        boolean flag = testData.containsValue(("Orange"));

        System.out.println(flag);


        testData.remove(2);
    }
}
