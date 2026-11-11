package class_Car4;

public class CarExample {
    public static void main(String[] args) {
        Car4 myCar = new Car4();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.err.println("출발합니다.");
            myCar.run();
        }

        if(myCar.isLeftGas()) {
            System.err.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.err.println("gas를 주입하세요.");
        }
    }
    
}
