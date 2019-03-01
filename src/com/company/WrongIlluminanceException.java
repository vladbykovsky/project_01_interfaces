package com.company;

public class WrongIlluminanceException extends Exception {

    private String Name;

    WrongIlluminanceException(String name){
        Name = name;
    }

    public void toPrint(){
        System.out.println("WrongIlluminanceException!");
        System.out.println("Освещенность должна быть в пределах от 300 до 4000лк, измените данные в "+ Name);
    }
}
