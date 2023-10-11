package vehicle;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();//Driver 객체 생성

        Bus bus = new Bus();//매개값으로 bus 객체를 제공하고 driver()메소드 호출
        driver.drive(bus);

        Taxi taxi = new Taxi();//매개값으로 taxi 객체를 제공하고 driver()메소드 호출
        driver.drive(taxi);

    }
}
