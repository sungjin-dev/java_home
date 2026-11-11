package class_Car2;

public class CarExample2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        System.out.println("car1.company: " + car1.company);   
        System.out.println();

        Car2 car2 = new Car2("자가용");
        System.out.println("car2.company: " + car2.company);   
        System.out.println("car2.model: " + car2.model);   
        System.out.println();

        Car2 car3 = new Car2("자가용","빨강");
        System.out.println("car3.company: " + car3.company);   
        System.out.println("car3.model: " + car3.model);   
        System.out.println("car3.color: " + car3.color);   
        System.out.println(); 

        Car2 car4 = new Car2("택시","검정",200);
        System.out.println("car4.company: " + car4.company);   
        System.out.println("car4.model: " + car4.model);   
        System.out.println("car4.color: " + car4.color);   
        System.out.println("car4.maxSpeed: " + car4.maxSpeed);   
        System.out.println();  

        Car2 car5 = new Car2("택시","검정",200, true);
        System.out.println("car5.company: " + car5.company);   
        System.out.println("car5.model: " + car5.model);   
        System.out.println("car5.color: " + car5.color);   
        System.out.println("car5.maxSpeed: " + car5.maxSpeed);   
        System.out.println("car5.possesion: " + car5.possesion);   
        System.out.println();  

        Car2 car6 = new Car2("택시","검정",200, true, 'A');
        System.out.println("car6.company: " + car6.company);   
        System.out.println("car6.model: " + car6.model);   
        System.out.println("car6.color: " + car6.color);   
        System.out.println("car6.maxSpeed: " + car6.maxSpeed);   
        System.out.println("car6.possesion: " + car6.possesion);   
        System.out.println("car6.grade: " + car6.grade);   
        System.out.println();   
    }
}
