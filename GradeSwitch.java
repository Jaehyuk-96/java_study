package com.mystudy.oct05;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("점수를 입력하세요:");
        int score = (scanner.nextInt())/10;
        char grade;
        switch(score){
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            case 6 :
                grade = 'D';
                break;
            default :
                grade = 'E';


        }
        System.out.println("입력한 학생의 학점은"+grade+"학점입니다.");

    }

}
