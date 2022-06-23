package com.educative.ecommerce.exceptions;

//class to handle exceptions related to authentication.
public class AuthenticationFailException extends Exception {
    public AuthenticationFailException(String msg) {
        super(msg);
    }
}