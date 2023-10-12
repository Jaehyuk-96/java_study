package com.mystudy.oct12.interf.exam01;


import com.mystudy.oct12.interf.exam01.RemoteControl;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("tv를 켭니다.");
    }
}
