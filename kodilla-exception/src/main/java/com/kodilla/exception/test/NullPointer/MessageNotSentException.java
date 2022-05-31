package com.kodilla.exception.test.NullPointer;

public class MessageNotSentException extends Exception{

    public MessageNotSentException(final String message){
        super(message);
    }
}
