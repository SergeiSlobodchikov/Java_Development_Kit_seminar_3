package org.example.Exceptions;

public class MyArraysTypeException extends RuntimeException {

    public MyArraysTypeException() {
        super("Типы массивов отличаются");
    }
}
