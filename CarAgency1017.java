package oct17.generic3;

public class CarAgency1017 implements Rentable1017<Car10171>{
    @Override
    public Car10171 rent() {
        return new Car10171();
    }
}
