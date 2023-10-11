package phone;

public class SmartPhoneExample2 {
    public static void main(String[] args) {

        //SmartPhone 객체생성
        SmartPhone2 myPhone = new SmartPhone2("아이폰","그레이색");
        //phone으로 부터 상속받은 필드 읽기
        System.out.println("모델 = " + myPhone.model);
        System.out.println("색상 = " + myPhone.color);
        //SmartPhone의 필드 읽기
        System.out.println("와이파이 상태" + myPhone.wifi);

        //Phone으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
        myPhone.sendVoice("아~네 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
