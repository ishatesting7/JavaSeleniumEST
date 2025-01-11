package org.example;

public class ExceptionHandlingDemo {

    public static void main(String args[])
    {
        try {
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e)
        {

            System.out.println("Invalid Operation");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {

        }
        finally {
            System.out.println(" Mandatory Steps");
        }
    }
}
