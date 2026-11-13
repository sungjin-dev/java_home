package package_interface_car;

public class Car {
    Tire[] tires = {
       new HankookTire(),
       new HankookTire(),
       new HankookTire(),
       new HankookTire()
    };

    void run() {
        for(int i=0;i<=tires.length; i++) {
         tires[i].roll(); 
    }

}

}