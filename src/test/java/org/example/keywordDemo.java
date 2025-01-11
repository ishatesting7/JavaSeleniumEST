package org.example;

public class keywordDemo {

    static int m = 100;

    static void demo1()
    {
        System.out.println(" I am in Static method ");
    }

    public static void main(String args[])
    {
        demo1();
        keywordDemo.demo1();
        System.out.println(m);
    }

}
