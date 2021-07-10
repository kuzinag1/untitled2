package com.company;

public class FoodEcaption extends Exception{

    public FoodEcaption() {
    }

    public FoodEcaption(String message) {
        super(message);
    }

    public FoodEcaption(String message, Throwable cause) {
        super(message, cause);
    }

    public FoodEcaption(Throwable cause) {
        super(cause);
    }

    public FoodEcaption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
