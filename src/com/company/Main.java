package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Building building1 = new Building("Здание 1");

        building1.addRoom("Комната 1", 20, 1);
        building1.addRoom("Комната 2", 5, 4);
        building1.addRoom("Комната 3", 30, 3);
        building1.getRoom("Комната 1").add(new Bulb(200));
        building1.getRoom("Комната 2").add(new Bulb(100));
        building1.getRoom("Комната 3").add(new Bulb(100));
        building1.getRoom("Комната 1").add(new Furniture("Диван", 2, 4));
        building1.getRoom("Комната 2").add(new Furniture("Стол", 3));
        building1.getRoom("Комната 2").add(new Furniture("Шкаф", 10));

        Building.describe();
    }
}
