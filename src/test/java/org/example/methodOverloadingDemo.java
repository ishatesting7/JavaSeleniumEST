package org.example;

public class methodOverloadingDemo {

    /*
   1. Name of the method should be same
   2. Number of parameter should be different
   3. Return type can be diff
   4. Compile time polymorphism

     */

    public static void main(String arg[])
    {
        //Create the Object
        methodOverloadingDemo obj = new methodOverloadingDemo();
        obj.methodOverload1(14,"abc");
        obj.methodOverload1("abc");
        //System.out.println(value);
        obj.methodOverload1("14","abc");


    }

    void methodOverload1()
    {
        System.out.println("Overloading Demo - 1");
    }
    int methodOverload1(String abc)
    {
        System.out.println("Overloading Demo - 2");
        System.out.println(abc);
        return 39;

    }
    void methodOverload1(String abc, String xyz)
    {
        System.out.println("Overloading Demo - 3");
        System.out.println(abc);
        System.out.println(xyz);

    }
    void methodOverload1(int abc, String xyz)
    {
        System.out.println("Overloading Demo - 4");
        System.out.println(abc);
        System.out.println(xyz);

    }


}
