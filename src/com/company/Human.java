package com.company;

public class Human {
    private Animal animal;
    public void toEat(Animal animal, String food) {
        try {
            animal.eat(food);
        } catch (FoodEcaption foodEcaption) {
            System.out.println("Вы покормили " + food);
        }
    }
}
