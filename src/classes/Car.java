package classes;
import enums.Type;
import jdk.jshell.execution.Util;

public class Car extends Vehicule {
    private int mWheelsNumber = 0;
    private final boolean mHasWheels = true;

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
        this.mType = Type.CAR;
    }

    public Type getType() {
        return this.mType;
    }

    //Utils
    public boolean hasWheels() {
        return this.mHasWheels;
    }



}
