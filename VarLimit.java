package com.mystudy.run;

public class VarLimit {
    public static void main(String[] args) {

        byte i = 127;
        byte j = 4;
        byte sum = 0;

        sum = (byte) (i+j);
        //i+j 기본형이 int여서 강제형변환

        System.out.println(i + "+" + j + "=" + sum);
    }
}
