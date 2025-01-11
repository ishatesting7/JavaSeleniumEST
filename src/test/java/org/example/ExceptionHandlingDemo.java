package org.example;

public class ExceptionHandlingDemo {

    public static void main(String args[]) throws InterruptedException {
        try {
            int m[] = {1,2};
            System.out.println(m[4]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid Operation = 1");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Operation");
        }
        finally {
            System.out.println(" Mandatory Steps");
        }

        //Thread.sleep(15000);

        try{
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid Operation = 2");
        }
    }
}
