package com.kenny.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        /* 오버 플로우에 대해 이해할 수 있다. */

        /* byte는 1byte의 공간을 할당받음
        * [  | 1 | 1 | 1 | 1 | 1 | 1 | 1 ]
        * 맨 앞의 공간은 값의 크기가 아니라 부호를 나타내기 위한 공간. = 부호비트 */
        byte num1 = 127;    // byte에 들어갈 수 있는 최대 값
        System.out.println("num1 : " + num1);
        num1++;
        System.out.println("num1 : " + num1);   //128이 아니라 -128이 나옴
        /* 01111111 에 1을 더하면 10000000이 나옴.
        * 최대값에 더하기를 하면 최소값이 나옴
        * 부호비트가 반전되기 때문*/

        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--;
        System.out.println("num2 : " + num2);

        /* 오버 플로우, 언더 플로우는 컴파일 에러는 발생하지 않지만 최대값 최소값 범위를 고려하여 자료형을 선택해야 한다.*/
        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println("multi : " + multi);

        //제대로 된 값을 얻고 싶다면?
        //long longMulti = firstNum * secondNum;  // int(4byte) * int(4byte) = int(4byte)
        //System.out.println("longMulti : " + longMulti);
        // 이것도 이미 int에서 오버플로우가 일어났기 때문에 의미 x

        //형변환 연산자
        long longMulti = (long)firstNum * secondNum;  // int(4byte) * int(4byte) = int(4byte)
        System.out.println("longMulti : " + longMulti);

    }
}
