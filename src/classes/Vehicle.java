package classes;
import enums.Type;

// Has to be modified to use an interface --> See according VehicleInterface
public abstract class Vehicle {
    protected Type mType= Type._NONE;
    public abstract boolean hasWheels();
    public abstract void setType(Type aType);
    public abstract Type getType();
}
