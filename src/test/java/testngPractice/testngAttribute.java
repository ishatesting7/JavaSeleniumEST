package testngPractice;

import org.testng.annotations.Test;

public class testngAttribute {

    @Test(priority = -1)
    void Demo1()
    {
        System.out.println("I am in Demo1");
    }

    @Test(priority = 2)
    void Demo2()
    {
        System.out.println("I am in Demo2");
    }

    @Test(priority = -3)
    void Demo3()
    {
        System.out.println("I am in Demo3");
    }

    @Test(timeOut = 2000)
    void timeoutDemmo() throws InterruptedException {
        Thread.sleep(1000);
                //navigatingtourl
                //enteringusername
    }

    @Test(invocationCount = 5)
    void invocationCountDemo()
    {
        System.out.println("Invocation Count 5");
    }

    @Test(description = "This is related to login flow")
    void descriptionDemo()
    {
        System.out.println("Description Demo");

    }

    @Test(alwaysRun = false)
    void alwayRunDemo()
    {
        System.out.println("Always Run Demo");
    }

}
