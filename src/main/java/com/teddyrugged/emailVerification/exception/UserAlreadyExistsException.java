package com.teddyrugged.emailVerification.exception;

public class UserAlreadyExistsException extends RuntimeException {
//    public UserAlreadyExistsException(String s) {
//    }

    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
