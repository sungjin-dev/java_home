package package_drive_interface;

public class Bus implements Vehicle{
    
    @Override 
    public void run() {
        System.out.println("버스가 달려갑니다.");
    }
    public void checkFare() {
        System.out.println("세금을 부가합니다.");
    }
}
