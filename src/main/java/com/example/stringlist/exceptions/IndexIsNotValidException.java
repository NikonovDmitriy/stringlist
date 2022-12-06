package com.example.stringlist.exceptions;

public class IndexIsNotValidException extends RuntimeException{

    public IndexIsNotValidException() {
        super("Index out of bounds!");
    }
}
