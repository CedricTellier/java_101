package interfaces;

import enums.Type;

public class Bike implements VehicleInterface{
    private Type mType = Type._NONE;
    private final boolean hasWheels = true;

    public boolean hasWheels(){
        return this.hasWheels;
    };

    public void setType(Type aType){
        this.mType = aType;
    }

    public Type getType(){return this.mType;}
}
