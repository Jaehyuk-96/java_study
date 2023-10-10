package oct10;

public class CarExample {
    public static void main(String[] args) {
        //Car 개체 생성
        Car myCar = new Car();

        //Car 객체의 필드값 읽기
        System.out.println("제조회사 = " + myCar.company);
        System.out.println("모델명 = " + myCar.model);
        System.out.println("색상 = " + myCar.color);
        System.out.println("현재속도 = " + myCar.speed);
        System.out.println("최고속도 = " + myCar.maxSpeed);

        myCar.speed = 60;
        System.out.println("수정된속도 = "+myCar.speed);



    }
}
