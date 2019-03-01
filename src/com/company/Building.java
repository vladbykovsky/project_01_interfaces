package com.company;

import java.util.ArrayList;

public class Building implements IRoom {

    private String buildingName;

    //Список зданий
    public static ArrayList<Building> listBuilding = new ArrayList<Building>();

    //Список помещений в данном здании
    public static ArrayList<Room> listRoom = new ArrayList<Room>();

    Building(String name){
        buildingName = name;
        listBuilding.add(Building.this);
    }

    Building(){
        buildingName = "Здание без имени";
    }

    public String getBuildingName(){
        return buildingName;
    }

    @Override
    //Добавление помещения в здание
    public void addRoom(String name, int square, int window) {
        Room room = new Room(name, square, window);
        listRoom.add(room);
    }

    @Override
    //Получение коллекции с мебелью и лампочками
    public ArrayList getRoom(String name){
        ArrayList<Predmets> listBulbFurniture = new ArrayList<Predmets>();
        for (Room r : listRoom) {
            if (r.getRoomName().equals(name))
                 listBulbFurniture = r.listEquipment;
        }
        return listBulbFurniture;
    }

    //Вывод всех данных
    public static void describe(){
        for (Building b : Building.listBuilding){
            System.out.println(b.getBuildingName());
            for (Room r : listRoom){
                r.CalcOptions();
                if((r.CheckLight(r.getRoomName()))
                        &&(r.CheckSquare(r.getRoomName()))){
                    System.out.println(" "+r.getRoomName());
                    System.out.println("  Освещенность = "+r.getLighting());
                    System.out.println("  Площадь = "+r.getSquare()+" м^2"
                            +" занято "+r.getFurnitureSquare()+" м^2");
                    System.out.println("   Мебель: ");

                        for (Predmets p : r.listEquipment){
                            if (p.getFurnitureName() == null)
                                System.out.print("");
                            else if( p.getSuperSquare() > 0)
                                System.out.println("    "+p.getFurnitureName()
                                    +" (Плошадь "+p.getSquare()
                                    +"-"+p.getSuperSquare()
                                    +" м^2)");
                            else if (p.getSuperSquare() <= 0)
                                System.out.println("    "+p.getFurnitureName()
                                    +" (Плошадь "+p.getSquare()+" м^2)");
                        }
                }
            }
        }
    }
}

