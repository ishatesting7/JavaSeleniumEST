package org.example;

public class ConstructorDemo {

    public static void main(String arg[])
    {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(12,123);

    }

    ConstructorDemo()
    {
        System.out.println("Default Constructor");
    }

    ConstructorDemo(int a, int b)
    {
        System.out.println("Parameterised Constructor");
    }
}
