package com.company;

public class Bulb extends Predmets {

    private double bulbLight;

    Bulb(double light){
        bulbLight = light;
    }

    Bulb(){
        bulbLight = 0;
    }

    @Override
    public double getBulbLight() {
        return bulbLight;
    }
}
