package com.company;

public class WrongSpaceException extends Exception {
    private String Name;

    WrongSpaceException(String name){
        Name = name;
    }

    public void toPrint(){
        System.out.println("WrongSpaceException!");
        System.out.println("Мебель не должна занимать больше 70% площади помещения, измените данные в "+ Name);
    }
}
