package com.example.networktask;

/**
 * Implement this callback with a lambda to use it
 */
public interface NetworkCallback {
    void callback(Object data, boolean success);
}