package com.example.stringlist.exceptions;

public class ItemNotExistException extends RuntimeException{

    public ItemNotExistException() {
        super("This item dos not exist!");
    }
}
