package com.mystudy;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {

        while(true){

            Scanner scanner = new Scanner(System.in);
            System.out.println(" 몇단을 입력할까요?(0또는 1이면 종료):");
            int n = scanner.nextInt();

            if(n == 0 || n==1){
                break;
            }

            for(int i=1; i<10; i++){
                System.out.printf("%2d *%2d = %2d", n, i , n*i);
                System.out.println();



            }

        }//("%2d *%2d = %2d", n, i , n*i);
    }
}
