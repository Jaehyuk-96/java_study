package com.mystudy.etc;

public class LocalVariableExample {
    public static void main(String[] args) {
        int v1 = 1;
        System.out.println("v1 = " + v1);
        if(true){
            int v2 = 2;
            if(true){
                int v3= 3;
                System.out.println("v1 = " + v1);
                System.out.println("v2 = " + v2);
                System.out.println("v3 = " + v3);
            }
            System.out.println("v1 = " + v1);
            System.out.println("v2 = " + v2);
            //System.out.println("v3 = " + v3);컴파일에러
        }
        System.out.println("v1 = " + v1);
        //System.out.println("v2 = " + v2); 컴파일에러

    }
}
