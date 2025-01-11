package org.example;

import java.lang.constant.DynamicCallSiteDesc;

public class HelloWorld{

    public static void main(String arg[])
    {
        System.out.println("I am new to Java");

        System.out.println("I am learning java");

        //Variable and Datatype

        int m = 10;
        int n = 12;
        int sum = m + n;
        System.out.println(sum);

        // Datatype

        float mo = 10.12f; //f - literals
        String so = "I am learning Java from scratch";
        char ch = 'I';
        char ch2 = 127;
        // ASCII - American Standard Code for Information and Interchange
        System.out.println(ch2);
        System.out.println(so);
        double doo = 10.392d;
        // int, float, double, char, long, short, boolean, String, byte
        //<Datatype Name> nameofthevarible = value
        int m1 = 10, m2 = 20, m3 = 30;
        System.out.println("Addition of 3 number - " + (m1+m2+m3));
        //String is a class in Java - Class will always start with Capital Letter

        int n1 = 12, n2 = 14, n3 = 16;

        System.out.println("Average of 3 Number - "+ ((n1 + n2 + n3)/3));

        System.out.println("The number of character is - "+ so.length());

        HelloWorld obj = new HelloWorld();
        obj.methodDemo();
        System.out.print(obj.methodDemo2());
        obj.sumOfTwoNumber(19,390);
    }
    void methodDemo()
    {
        System.out.println(" I am in method Demo ");
    }

    int methodDemo2()
    {
        System.out.println("I am in another method without return type");
        return 9090;
    }

    int sumOfTwoNumber(int m, int n)
    {
        System.out.println("Addition Value - "+ (m+n));
        int sum = m + n;
        return sum;
    }
}

//Comments in Java - SINGLE LINE COMMENT AND MULTILINE COMMENTS

//Single Line Comment

/*
 */