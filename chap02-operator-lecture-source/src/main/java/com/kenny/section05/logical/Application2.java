package com.kenny.section05.logical;


public class Application2 {
    public static void main(String[] args) {
        /* 논리 연산자를 활용할 수 있다. */

        /* 1. 1부터 100 사이의 값인지 확인 */
        int num = 15;
        System.out.println("1~100 사이의 값인지 확인 : " + (num >= 1 && num <= 100));

        /* 2. 영어 대문자인지 확인 */
        char ch = 'G';
        // ascii 코드 : A-65, B-66, ...
        // ascii 코드의 A ~ Z 범위 안에 있는지 확인
        System.out.println("영어 대문자인지 확인 : " + (ch >= 'A' && ch <= 'Z'));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        char ch2 = 'y';
        System.out.println("영문자 y인지 확인: " + (ch2 == 'y' || ch2 == 'Y'));

        /* 4. 영문자인지 확인 (대소문자 모두 포함) */
        char ch3 = '가';
        // A-65..., a-97...
        System.out.println("영문자인지 확인 : " + ((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z')));
        // 우선순위 : and > or
        // 괄호를 이용해 우선순위를 맞춰줄 수 있다

    }
}
