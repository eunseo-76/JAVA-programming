package com.kenny.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        /* 삼항 연산자에 대해 이해하고 활용할 수 있다. */
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0) ? "양수다" : "양수가 아니다";
        String result2 = (num1 > 0) ? "양수다" : "양수가 아니다";
        System.out.println("num1은 " + result1);
        System.out.println("num2은 " + result2);

        /* 중첩 사용 가능 */
        // 삼항 연산자를 계속 중첩하면 가독성이 떨어지기 때문에 자제
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;
        String result3 = (num3 > 0) ? "양수다" : (num3 == 0) ? "0이다" : "음수다";
        String result4 = (num3 > 0) ? "양수다" : (num3 == 0) ? "0이다" : "음수다";
        String result5 = (num3 > 0) ? "양수다" : (num3 == 0) ? "0이다" : "음수다";
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
