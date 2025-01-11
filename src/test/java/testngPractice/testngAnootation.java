package testngPractice;

import org.testng.annotations.*;

public class testngAnootation {

   @BeforeSuite
   void beforeSuiteDemo()
   {
       System.out.println(" I am in before Suite");
   }

    @AfterSuite
    void afterSuiteDemo()
    {
        System.out.println(" I am in after Suite");
    }

    @BeforeClass
    void beforeClassDemo()
    {
        System.out.println("I am in before Class");
    }

    @AfterClass
    void afterClassDemo()
    {
        System.out.println("I am in after Class");

    }

    @BeforeMethod
    void beforeMethoDemo()
    {
        System.out.println("I am in Before Method");

    }


    @AfterMethod
    void afterMethodDemo()
    {
        System.out.println("I am in after Method");

    }


    @BeforeTest
    void beforeTestMethod()
    {
        System.out.println("I am in before Test Method");

    }


    @AfterTest
    void AfterTestMethod()
    {
        System.out.println("I am in after Test Method");

    }

    @Test
    void tesCases1()
    {
        System.out.println("Actual Test Cases - 1");
    }

    @Test
    void tesCases2()
    {
        System.out.println("Actual Test Cases - 2");
    }

    @Test
    void tesCases3()
    {
        System.out.println("Actual Test Cases - 3");
    }

    @Test
    void tesCases4()
    {
        System.out.println("Actual Test Cases - 4");
    }
// BeforeSuite > BeforeTest > BeforeClass > BeforeMethod > Test > AfterMethod > AfterClass > AfterTest > Suite


    @BeforeGroups
    void beforeGroup()
    {
        System.out.println("I am in before Group");

    }

    @AfterGroups
    void afterGroup()
    {
        System.out.println("I am in after Group");

    }
}
