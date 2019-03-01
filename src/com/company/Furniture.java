package com.company;

public class Furniture extends Predmets {

    private String FurnitureName;
    private int Square;
    private int SuperSquare;

    Furniture(String name, int square, int superSquare){
        this.FurnitureName = name;
        this.Square = square;
        this.SuperSquare = superSquare;
    }

    Furniture(String name, int square){
        this.FurnitureName = name;
        this.Square = square;
    }

    public String getFurnitureName() {
        return FurnitureName;
    }

    public int getSquare() {
        return Square;
    }

    public int getSuperSquare() {
        return SuperSquare;
    }
}
