package com.kenny.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        /* if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfStatement(){
        /* 중첩된 if문의 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력 :");
        int num = sc.nextInt();

        if(num > 0){
            if(num % 2 == 0){
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}