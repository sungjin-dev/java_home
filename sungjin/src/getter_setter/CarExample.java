package getter_setter;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50); /* 잘못된 속도 변경 */
        System.err.println("현재 속도: " + myCar.getSpeed());

        myCar.setSpeed(60);
        
        if(!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.err.println("현재 속도: " + myCar.getSpeed());

    }
}

