package com.gmail.shared.exception;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(message);
    }

    public EmptyStringException() {
    }
}
