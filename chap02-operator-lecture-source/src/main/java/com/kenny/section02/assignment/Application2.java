package com.kenny.section02.assignment;

public class Application2 {
    public static void main(String[] args) {
        /* 대입 연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다. */

        int num = 12;   // = 는 대입 연산자. = 의 오른쪽 값이 = 왼쪽의 공간으로 대입됨

        // 3 증가
        num = num + 3;

        // 3 증가 (산술 복합 대입 연산자)
        num += 3;   // 대입할 값을 3만큼 증가시키면서 대입
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 2;
        System.out.println("num = " + num);

        // 산술 복합 연산자는 한 덩어리 연산자이므로 붙여서 써야 함
        /* 주의 : 산술 복합 대입 연산자의 작성 순서 */
        num =- 5;
        System.out.println("num = " + num);
        // num에 -5를 대입함

    }
}
