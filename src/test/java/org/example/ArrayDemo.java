package org.example;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String arg[])
    {
        int m[] = {132,312,3214,23321};

        int []n = {132,312,3214,23321};

        String arr[] = {"Nine", "Ten", "Eleven is the number", "Twelve"};

        int m1[] = new int[10]; // m1[0], m1[1], m1[2], m1[3], m1[4]

        m1[9] = 20;

        m1[8] = 203;

        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the value of an array");
//        for(int i=0; i<m1.length;i++)
//        {
//            m1[i] = s.nextInt();
//        }

        for(int i=0; i<arr.length;i++)
        {
           System.out.println(arr[i]);
        }


    }

}
