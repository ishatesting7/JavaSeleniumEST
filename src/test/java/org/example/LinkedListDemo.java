package org.example;

import java.util.LinkedList;

public class LinkedListDemo {


    public static void main(String args[]) {
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("FIRST");

        linkedlist.add("SECOND");

        linkedlist.add("THIRD");

        System.out.println(linkedlist);

        System.out.println(linkedlist.getFirst());

        System.out.println(linkedlist.getLast());

        System.out.println(linkedlist.size());

    }

}
