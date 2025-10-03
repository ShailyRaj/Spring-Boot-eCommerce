package com.ecommerce.project.exceptions;

// My custom exception
public class NoResultFoundException extends RuntimeException {
    public NoResultFoundException() {

    }

    public NoResultFoundException(String message) {
        super(message);
    }
}
