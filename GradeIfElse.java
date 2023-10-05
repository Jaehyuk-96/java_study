package com.mystudy.oct05;

import java.util.Scanner;

public class GradeIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를입력하세요:");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80) {
            System.out.println("B학점입니다.");

        } else if (score >= 70) {
            System.out.println("C학점입니다.");

        } else if (score >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점입니다.");
        }
    }
}