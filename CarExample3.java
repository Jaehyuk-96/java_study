package tire;

public class CarExample3 {
    public static void main(String[] args) {
        Car3 myCar = new Car3();//car 객체 생성

        myCar.tire = new Tire();//tire 객체 장착
        myCar.run();

        myCar.tire = new HankookTire();//hankooktire 객체 장착
        myCar.run();

        myCar.tire = new KumhoTire();//kumhotire 객체 장착
        myCar.run();
    }
}
