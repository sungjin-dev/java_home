package class_Car6;

public class Car6 {
    // 필드
    String model;
    int speed;

    //생성자
    Car6(String model) {
        this.model = model;
    }

    //메서드
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for(int i=10; i<=50; i+=10) {
            this.setSpeed(i);
            System.err.println(this.model + "가 달립니다.(시속:"+this.speed+"km/h");
        }
    }
}
