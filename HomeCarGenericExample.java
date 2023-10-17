package oct17.generic3;

public class HomeCarGenericExample {
    public static void main(String[] args) {
        HomeAgency1017 homeagency = new HomeAgency1017();
        Home1017 home = homeagency.rent();
        home.turnOnLight();

        CarAgency1017 caragency = new CarAgency1017();
        Car10171 car = caragency.rent();
        car.run();
    }
}
