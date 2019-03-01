package com.company;

public class Bulb extends Predmets {

    private double BulbLight;

    Bulb(double light){
        BulbLight = light;
    }

    Bulb(){
        BulbLight = 0;
    }

    @Override
    public double getBulbLight() {
        return BulbLight;
    }
}
