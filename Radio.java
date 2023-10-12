package com.mystudy.oct12.interf.exam01;


public class Radio implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("라디오를 켭니다.");
    }
}
