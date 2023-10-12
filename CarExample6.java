package com.mystudy.oct12.interf.exam04;

public class CarExample6 {
    public static void main(String[] args) {
        Car6 myCar = new Car6();
        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}
