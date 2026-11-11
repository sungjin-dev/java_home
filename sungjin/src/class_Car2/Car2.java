package class_Car2;

public class Car2 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    boolean possesion;
    char grade;

    Car2(){

    }

    Car2(String model) {
        this.model = model;
    }

    Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car2(String model, String color, int maxSpeed, boolean possesion) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.possesion = possesion;
    }

    Car2(String model, String color, int maxSpeed, boolean possesion, char grade) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.possesion = possesion;
        this.grade = grade;
    }
}
