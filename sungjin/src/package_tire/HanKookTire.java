package package_tire;

public class HanKookTire extends Tire{
    //필드
    //생성자
    public HanKookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //메소드
    @Override 
    public boolean roll() {
        ++accmulatedRotation;
        if(accmulatedRotation<maxRotation) {
            System.out.println(location + "HanKookTire 수명: " + (maxRotation-accmulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " HanKookTire 펑크 ***");
            return false;
        }
    }
}
