package oct13;
//익명객체

public class Car1013 {

    private Tire1013 tire1 = new Tire1013();

    //필드에 익명 자식 객체 대입
    private Tire1013 tire2 = new Tire1013() {
        @Override
        public void roll() {
            System.out.println("익명 자식 타이어 1이 굴러갑니다.");
        }
    };

    //메소드(필드 이용)
    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){
        Tire1013 tire = new Tire1013(){//로컬 변수에 익명 자식 객체 대입
            @Override
            public void roll() {
                System.out.println("익명 자식 tire 객체 2가 굴러갑니다.");
            }
        };
        tire.roll();
    }
    //메소드(매개변수 이용)
    public void run3(Tire1013 tire){
        tire.roll();
    }

}
