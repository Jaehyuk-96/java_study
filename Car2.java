package oct10.example02;

public class Car2 {

    //필드선언

    String company = "현대자동차";

    String model;

    String color;

    int maxSpeed;
    int speed;

    public Car2() {
    }

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car2(String model) {
        this.model = model;
    }

    public Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
