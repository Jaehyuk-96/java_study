package com.mystudy.oct12.interf.exam04;

public class Car6 {
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }

}
