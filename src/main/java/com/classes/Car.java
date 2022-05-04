package com.classes;
import com.enums.Type;
import com.utils.Utils;

public class Car extends Vehicle {
    private int mWheelsNumber = 0;
    private final boolean mHasWheels = true;
    private Type mType = Type._NONE;

    //Constructors
    public Car() {
    };

    public Car(int wheelsNumber) {
        this.mWheelsNumber = wheelsNumber;
        System.out.println(Utils.isEven(this.getNumberOfWheels()));
    }

    //Getters - Setters
    public int getNumberOfWheels() {
        return this.mWheelsNumber;
    }

    public void setNumberOfWheels(int aWheels) {
        this.mWheelsNumber = aWheels;
    }

    public void setType(Type aType) {
        this.mType = aType;
    }

    public Type getType() {
        return this.mType;
    }

    //Utils
    public boolean hasWheels() {
        return this.mHasWheels;
    }
}
