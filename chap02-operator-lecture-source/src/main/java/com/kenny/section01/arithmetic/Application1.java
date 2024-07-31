package com.kenny.section01.arithmetic;

public class Application1 {
    public static void main(String[] args) {
        /* 산술 연산자에 대해 이해하고 활용할 수 있다. */
        int num1 = 20;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println("num1 + num2 = " + (num1 + num2));   //컴파일 에러는 안 나지만 207이 될 수 있음
        System.out.println("num1 - num2 = " + (num1 - num2)); //문자열 간의 빼기 연산 불가하므로 에러
        System.out.println("num1 * num2 = " + num1 * num2);
        System.out.println("num1 / num2 = " + num1 / num2);
        System.out.println("num1 % num2 = " + num1 % num2);
    }
}
