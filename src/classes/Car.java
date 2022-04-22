package classes;

import enums.myEnums;

public class Car extends Vehicule {

    private myEnums lENum;
    private int mWheelsNumber = 0;
    private final boolean hasWheels = true;

    public Car(int wheelsNumber){
        this.mWheelsNumber = 4;
    }

    public Car(){};
    public boolean hasWheels(){
        return this.hasWheels();
    }

    public int getNumberOfWheels(){
        return this.mWheelsNumber;
    }
}
