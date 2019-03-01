package com.company;

import java.util.ArrayList;

public class Room implements IOptions {

    private String RoomName;
    private double Square;
    private int FurnitureSquare;
    private int Window;
    private double Lighting = 0;

    // Список, содержащий мебель и лампочки
    ArrayList<Predmets> listEquipment = new ArrayList<Predmets>();


    Room(String name, double square, int window){
        RoomName = name;
        Square = square;
        Window = window;
    }

    // Вычисление освещенности
    public void CalcOptions(){

        Lighting = Window * 700;
        for (Predmets p : listEquipment){
            Lighting += p.getBulbLight();
            if (p.getSuperSquare() > 0)
                FurnitureSquare += p.getSuperSquare();
            else
            FurnitureSquare += p.getSquare();
        }
    }

    public boolean CheckLight(String name){
        boolean res = true;
        try {
            if ((Lighting < 300) || (Lighting > 4000)){
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
            if (FurnitureSquare > Square * 0.7){
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
        return RoomName;
    }

    public double getSquare(){
        return  Square;
    }

    public int getFurnitureSquare() {
        return FurnitureSquare;
    }

    public int getWindow(){
        return Window;
    }

    public double getLighting(){
        return Lighting;
    }

}
