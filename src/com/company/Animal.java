package com.company;

public class Animal {

    public Animal() {
    }

    public void eat(String source) throws FoodEcaption{
        if (source.equalsIgnoreCase("Мясо")) {
            throw new FoodEcaption();
                }
        else {
            System.out.println("Мы покормили животное");

        }


	// write your code here
    }
}
