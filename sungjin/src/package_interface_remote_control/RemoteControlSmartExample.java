package package_interface_remote_control;

public class RemoteControlSmartExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
               
}
}
