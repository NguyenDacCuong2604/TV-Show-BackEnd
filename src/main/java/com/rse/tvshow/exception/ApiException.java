package com.rse.tvshow.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}
