package com.educative.ecommerce.exceptions;

//register this exception in ExceptionControllerAdvice
public class CartItemNotExistException extends Exception {
    public CartItemNotExistException(String msg) {
        super(msg);
    }
}