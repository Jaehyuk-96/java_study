package oct11;

import java.security.PublicKey;

public class SmartPhone extends Phone{

    public SmartPhone(String model, String color) {
        super(model, color);//매개변수 선언시 super 사용 , 기본생성자 super 생략가능(컴파일시 자동추가)
        System.out.println("String model, String color" + "생성됨");
    }



}
