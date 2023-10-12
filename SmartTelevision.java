package com.mystudy.oct12.interf.exam03;

public class SmartTelevision implements RemoteControl3, Searchable{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");

    }

    @Override
    public void search(String url) {
        System.out.println(url+"를 검색합니다.");


    }
}
