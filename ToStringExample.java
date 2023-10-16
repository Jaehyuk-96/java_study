package oct16;

public class ToStringExample {
    public static void main(String[] args) {
        Smartphone1016 myPhone = new Smartphone1016("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
