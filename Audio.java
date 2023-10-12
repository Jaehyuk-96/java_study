package com.mystudy.oct12.interf.exam02;

public class Audio implements RemoteControl2 {

    //필드
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다");

    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");

    }


    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl2.MAX_VOLUME){
            this.volume = RemoteControl2.MAX_VOLUME;
        }else if(volume<RemoteControl2.MIN_VOLUME){
            this.volume = RemoteControl2.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 오디오의 볼륨:" + volume);


    }

    private int memoryVolume;//추가 필드선언
    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음처리합니다.");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("무음해제합니다.");
            setVolume(memoryVolume);//mute가 false일 경우, 원래 볼륨으로 복원하는 코드
        }

    }

}
