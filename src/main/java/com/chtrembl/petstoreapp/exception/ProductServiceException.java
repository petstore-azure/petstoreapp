package com.chtrembl.petstoreapp.exception;

public class ProductServiceException extends RuntimeException {
    public ProductServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}