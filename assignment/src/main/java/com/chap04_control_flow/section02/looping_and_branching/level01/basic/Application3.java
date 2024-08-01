package com.chap04_control_flow.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = scanner.nextInt();
        int result = 0;

        for(int i=1; i<input+1; i++){
            if(i % 2 != 0) continue;    //홀수면 넘어가서 증감
            result += i;
        }
        System.out.println("1부터 " + input + "까지의 합 : " + result);
    }
}
/* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
 *
 * -- 입력 예시 --
 * 정수를 입력하세요 : 10
 *
 * -- 출력 예시 --
 * 1부터 10까지 짝수의 합 : 30
 * */