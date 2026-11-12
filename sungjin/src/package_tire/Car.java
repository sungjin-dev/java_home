package package_tire;

public class Car {
    //필드
    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightire = new Tire("앞오른쪽", 4);

    //생성자

    //메서드
    int run() {
        System.err.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false) { stop(); return 1;};
        if(frontLeftTire.roll()==false) { stop(); return 2;};
        if(frontLeftTire.roll()==false) { stop(); return 3;};
        if(frontLeftTire.roll()==false) { stop(); return 4;};
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
