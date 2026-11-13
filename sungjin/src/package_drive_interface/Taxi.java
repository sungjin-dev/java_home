package package_drive_interface;

public class Taxi implements Vehicle{
    @Override 
    public void run() {
        System.out.println("택시가 달려갑니다.");
    }
    public void checkFare() {
        System.out.println("승차요금을 부가합니다.");
    }
}
