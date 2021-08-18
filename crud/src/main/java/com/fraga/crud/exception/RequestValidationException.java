package com.fraga.crud.exception;

public class RequestValidationException extends RuntimeException {
    // Exception son manejables y extienden de RunTimeException

    public RequestValidationException(String message) {
        super(message);
    }
}
