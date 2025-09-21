package com.universalpetcare.petcare_backend.exception;

public class UserAllreadyExistsException extends Throwable {
    public UserAllreadyExistsException(String s) {
        super(s);
    }
}
