package com.mystudy.oct12.interf.exam02;

import java.rmi.Remote;

public class Television2 implements RemoteControl2{

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");

    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl2.MAX_VOLUME){
            this.volume= RemoteControl2.MAX_VOLUME;
    }else if(volume<RemoteControl2.MIN_VOLUME){
            this.volume = RemoteControl2.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("tv 현재볼륨:" + volume);
    }
}
