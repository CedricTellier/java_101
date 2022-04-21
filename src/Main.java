public class Main {
    public static void main(String[] args) {

        Car lCar = new Car();
        System.out.println(lCar.getNumberOfWheels());
        Car lCAr2 = new Car(4);
        System.out.println(lCAr2.getNumberOfWheels());
    }
}
