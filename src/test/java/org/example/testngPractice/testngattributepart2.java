package org.example.testngPractice;

import org.testng.annotations.Test;

public class testngattributepart2 {


    @Test(groups = {"sanity"})
    void demo1()
    {
        System.out.println("I am in Sanity Group");
    }

    @Test(groups = {"Regression"})
    void demo2()
    {
        System.out.println("I am in Sanity Group");
    }

    @Test(groups = {"Smoke"})
    void demo3()
    {
        System.out.println("I am in Smoke Group");
    }

    @Test(groups = {"Smoke", "Sanity", "Regression"})
    void demo4()
    {
        System.out.println(" I am in all the group");
    }

    @Test(dependsOnGroups = {"Smoke"})
    void demo5()
    {
        System.out.println("I am in demo 5");
    }

    @Test
    void demo7()
    {
        System.out.println("I am in demo 7");
    }


    @Test(dependsOnMethods = {"demo7"})
    void demo6()
    {
        System.out.println(" I am in demo 6 ");
    }
}
