package com.kenny.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 5명의 자바 함수를 입력 받아 합계와 평균을 실수로 구하는 프로그램 */
        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++){
            System.out.print((i+1) + "번째 학생의 점수 입력: ");
            scores[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];   // 해당 값을 꺼내오는 것이므로 향상된 for문을 써도 됨
        }


        double avg = (double) sum / scores.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
