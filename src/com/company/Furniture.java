package com.company;

public class Furniture extends Predmets {

    private String furnitureName;
    private int square;
    private int superSquare;

    Furniture(String name, int square, int superSquare){
        this.furnitureName = name;
        this.square = square;
        this.superSquare = superSquare;
    }

    Furniture(String name, int square){
        this.furnitureName = name;
        this.square = square;
    }

    public String getFurnitureName() {
        return furnitureName;
    }

    public int getSquare() {
        return square;
    }

    public int getSuperSquare() {
        return superSquare;
    }
}
