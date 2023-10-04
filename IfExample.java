package com.mystudy;

import java.sql.SQLOutput;

public class IfExample {
    public static void main(String[] args) {
        int score =95;
        char grade;


        if(score>90){
            grade = 'A';

        }else if(score<80){
            grade = 'B';

        }else{
            grade = 'C';

        }
        System.out.println(score+"점은"+grade+"입니다.");
    }
}
