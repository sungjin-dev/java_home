package package_tire;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for(int i=1;i<=5; i++) {
            int problemLocation = car.run();
            if(problemLocation !=0) {
                System.out.println(car.tires[problemLocation-1].location+"HanKookTire로 교체");
                car.tires[problemLocation-1] = new HanKookTire(car.tires[problemLocation-1].location,15);
            }
        }


        // for(int i = 1; i<=5; i++) {
        //     int problemLocation = car.run();
        //     switch (problemLocation) {
        //         case 1:
        //             System.out.println("앞왼쪽 HankookTire로 교체");
        //             car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
        //             break;
        //         case 2:
        //             System.out.println("앞오른쪽 KumhoTire로 교체");
        //             car.frontRightTire = new HanKookTire("앞왼쪽", 15);
        //             break;
        //         case 3:
        //             System.out.println("뒤왼쪽 HankookTire로 교체");
        //             car.backLeftTire = new HanKookTire("앞왼쪽", 15);
        //             break;
        //         case 4:
        //             System.out.println("뒤오른쪽 KumhoTire로 교체");
        //             car.backRightire = new HanKookTire("앞왼쪽", 15);
        //             break;
        //     }

        //     System.out.println("-----------------------------------------");
        // }
    }
}
