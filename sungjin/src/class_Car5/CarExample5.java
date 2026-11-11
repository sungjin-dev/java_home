package class_Car5;

public class CarExample5 {
    public static void main(String[] args) {
        Car5 mycar = new Car5();
        mycar.keyTurnOn();
        mycar.run();
        int speed = mycar.getSpeed();
        System.err.println("현재 속도: " + speed + "km/h");
    }
}
