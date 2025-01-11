package org.example;

public class multipleInheritanceUsingInterface implements A, B {

    /**
     *
     */
    @Override
    public void methodA() {
        System.out.println("MethodA");
    }

    /**
     *
     */
    @Override
    public void methodB() {
        System.out.println("MethodB");

    }
}

interface A
{
    void methodA();
}

interface B
{
    void methodB();
}