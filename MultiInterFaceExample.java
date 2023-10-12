package com.mystudy.oct12.interf.exam03;

public class MultiInterFaceExample {
    public static void main(String[] args) {
        RemoteControl3 rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("www.youtube.com");


    }
}
