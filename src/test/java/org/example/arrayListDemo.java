package org.example;

import java.util.ArrayList;

public class arrayListDemo {

    public static void main(String args[]) {


        ArrayList<String> name = new ArrayList<>();
        name.add("First");
        name.add("Second");
        name.add("Third");
        System.out.println("Value is - "+name
        );

        System.out.println("Second value is - "+name.get(2)
        );


        name.set(1, "Facebook");

        for(String i : name)
        {
            name.set(1, "Facebook");
            System.out.println(i);
        }

        name.remove(2);

        System.out.println("Value is - "+name
        );

    }
}
