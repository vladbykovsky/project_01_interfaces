package com.company;

import java.util.ArrayList;

public class Room implements RoomOptions {

    private String roomName;
    private double square;
    private int furnitureSquare;
    private int window;
    private double lighting = 0;

    // Список, содержащий мебель и лампочки
    ArrayList<Predmets> listEquipment = new ArrayList<Predmets>();


    Room(String name, double square, int window){
        roomName = name;
        this.square = square;
        this.window = window;
    }

    // Вычисление освещенности
    public void CalcOptions(){

        lighting = window * 700;
        for (Predmets p : listEquipment){
            lighting += p.getBulbLight();
            if (p.getSuperSquare() > 0)
                furnitureSquare += p.getSuperSquare();
            else
            furnitureSquare += p.getSquare();
        }
    }

    public boolean CheckLight(String name){
        boolean res = true;
        try {
            if ((lighting < 300) || (lighting > 4000)){
                res = false;
                throw new WrongIlluminanceException(name);
            }
        }
        catch (WrongIlluminanceException exc){
            exc.toPrint();
        }
        return res;
    }

    public boolean CheckSquare(String name){
        boolean res = true;
        try {
            if (furnitureSquare > square * 0.7){
                res = false;
                throw new WrongSpaceException(name);
            }
        }
        catch (WrongSpaceException exc){
            exc.toPrint();
        }
        return res;
    }

    public String getRoomName(){
        return roomName;
    }

    public double getSquare(){
        return square;
    }

    public int getFurnitureSquare() {
        return furnitureSquare;
    }

    public int getWindow(){
        return window;
    }

    public double getLighting(){
        return lighting;
    }

}
