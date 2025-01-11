package org.example;

public class methodOverRidingDemo {
    /*
    1. Run time polymorphism
    2. Inheritance
    3. Parent Class --> Child Class

     */
    void demo1()
    {
        System.out.println("I am in parent class");
    }

    public static void main(String args[])
    {
        methodOverRidingDemo obj1 = new methodOverRidingDemo();
        obj1.demo1();
        methodOverRidingChild obj2 = new methodOverRidingChild();
        obj2.demo1();
        methodOverRidingDemo obj3;
        obj3 = new methodOverRidingChild();
        obj3.demo1();
        methodOverRidingDemo obj4;
        obj4 = new methodOverRidingChild2();
        obj4.demo1();
    }

}
class methodOverRidingChild extends methodOverRidingDemo
{
    @Override
    void demo1()
    {
        System.out.println("I am in child class");
    }

}

class methodOverRidingChild2 extends methodOverRidingDemo
{
    @Override
    void demo1()
    {
        System.out.println("I am in child class - 2");
    }

}
