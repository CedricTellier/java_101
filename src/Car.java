public class Car extends Vehicule{

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
