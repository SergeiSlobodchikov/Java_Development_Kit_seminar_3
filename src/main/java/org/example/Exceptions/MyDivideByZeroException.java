package org.example.Exceptions;

public class MyDivideByZeroException extends ArithmeticException {

    public MyDivideByZeroException() {
        super("На ноль делить нельзя");
    }

}
