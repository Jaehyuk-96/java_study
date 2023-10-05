package com.mystudy.oct05;

public class ArrayCreateByValueList2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83,90,87};
        int sum = 0;
        for(int i =0; i<3; i++){
            sum+= scores[i];
        }
        System.out.println("총합:"+sum);

        printItem(new int[] {83,90,87});
    }

    private static void printItem(int[] scores) {
        for(int i=0;i<3;i++){
            System.out.println("score["+i+"]:"+scores[i]);
        }
    }
}
