package org.example;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String ar)
    {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1,"ONE");

        hashtable.put(2,"TWO");

        hashtable.put(3,"THREE");

        hashtable.get(2);


        for(Integer key:hashtable.keySet())
        {
            System.out.println("KEY -- "+  key + "- Value - "+ hashtable.get(key));
        }

    }
}
