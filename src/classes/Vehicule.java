package classes;
import enums.Type;

public abstract class Vehicule {
    protected Type mType= Type._NONE;
    public abstract boolean hasWheels();
    public abstract void setType(Type aType);
    public abstract Type getType();
}
