package com.gmail.shared.exception;

public class DaoException extends RuntimeException {
    public DaoException() {
    }

    public DaoException(String message) {
        super(message);
    }
}
