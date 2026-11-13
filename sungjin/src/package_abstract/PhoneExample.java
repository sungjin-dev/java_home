package package_abstract;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new phone(); (X)

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
