package org.example;

// Importing required libraries
import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class One
class One {
    // Method to print "Geeks"
    public void print_geek() {
        System.out.println("Geeks");
    }
}

// Child class Two inherits from class One
class Two extends One {
    // Method to print "for"
    public void print_for() {
        System.out.println("for");
    }
}

// Child class Three inherits from class Two
class Three extends Two {
    // Method to print "Geeks"
    public void print_lastgeek() {
        System.out.println("Geeks");

    }
}


// Driver class
public class multilevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of class Three
        Three g = new Three();

        // Calling method from class One
        g.print_geek();

        // Calling method from class Two
        g.print_for();

        // Calling method from class Three
        g.print_lastgeek();
    }
}
