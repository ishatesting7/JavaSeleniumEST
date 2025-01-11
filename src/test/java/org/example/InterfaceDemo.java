package org.example;

public interface InterfaceDemo {

    /*
    - Abstract Method
    - Default method
    - Static Method
    - Constants
    - Multiple Inheritance
     */

    //Abstract method
    void abstractMethodDemo();


    void abstractMethodDemo1();

    //Default method
    default void defaultMethod()
    {
        System.out.println("I am in default Method");
    }

    //Static Method
    static void staticMethod()
    {
        System.out.println("I am in static Method");

    }
}

class ImplementKeyword implements InterfaceDemo
{

    /**
     *
     */
    @Override
    public void abstractMethodDemo() {
        System.out.println("abstractMethodDemo is implemented");
    }

    /**
     *
     */
    @Override
    public void abstractMethodDemo1() {
        System.out.println("abstractMethodDemo1 is implemented");
    }

    public static void main(String arg[])
    {
        System.out.println("IHHNI");
        ImplementKeyword obj = new ImplementKeyword();

        obj.abstractMethodDemo();
        obj.abstractMethodDemo1();

    }

}




