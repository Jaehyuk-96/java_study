package oct13;



public class CarExample1013 {
    public static void main(String[] args) {
        Car1013 car = new Car1013();
        car.run1();//익명 자식 객체가 대입된 필드 사용
        car.run2();//익명 자식 객체가 대입된 로컬변수 사용

        car.run3(new Tire1013(){//익명 자식 객체가 대입된 매개변수 사용
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });

    }





}
