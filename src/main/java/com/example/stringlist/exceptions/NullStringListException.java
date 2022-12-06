package com.example.stringlist.exceptions;

public class NullStringListException extends RuntimeException{

    public NullStringListException() {
        super("StringList in parameter must be not-null!");
    }
}