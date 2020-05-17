package com.gmail.shared.exception;

public class WrongDataException extends RuntimeException {
    public WrongDataException() {
    }

    public WrongDataException(String message) {
        super(message);
    }
}
