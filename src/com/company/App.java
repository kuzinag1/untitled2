package com.company;

public class App {
    public static void main(String[] args) {
        Animal a = new Animal();
        try {
            a.eat("Салат");
            a.eat("Мясо");

        }
        catch (FoodEcaption e) {
            System.out.println("Неверная еда");
        }
    }
}
