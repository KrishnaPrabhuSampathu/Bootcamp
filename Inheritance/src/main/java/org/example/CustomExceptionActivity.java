package org.example;

// 1 - Extend this class from Exception class
public class CustomExceptionActivity extends Exception {

    // 2 - Override getMessage() and provide the following message:
    @Override
    public String getMessage() {

        // "You are not allowed to use this program"
        return "You are not allowed to use this program";

    }
}

