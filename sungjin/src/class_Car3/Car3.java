package class_Car3;

public class Car3 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    boolean possesion;
    char grade;

    Car3(){
    }

    Car3(String model){
        this(model, null, 0,false, 'C');
    }

    Car3(String model, String color){
        this(model, color, 0,false,'C');
    }

    Car3(String model, String color, int maxSpeed, boolean possesion, char grade) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.possesion = possesion;
        this.grade = grade;
    }
}