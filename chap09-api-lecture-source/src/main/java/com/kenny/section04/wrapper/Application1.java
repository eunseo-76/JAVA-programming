package com.kenny.section04.wrapper;


public class Application1 {
    public static void main(String[] args) {
        /* Wrapper 클래스 사용법을 이해할 수 있다. */

        int num = 1;  // 기본 자료형 int 선언
//    Integer num1 = new Integer();   // 일반적인 객체 생성하듯 기본 생성자로 생성하려 했으나 안 됨

        /* Wrapper 클래스의 생성자는 1.9부터 Deprecated 되었다. */

//    Integer num1 = new Integer(num);   // 일반적인 객체 생성하듯 기본 생성자로 생성하려 했으나 안 됨
        // is deprecated : 이전에는 사용했으나 이제는 하지 않는 것을 권장한다는 의미

        /* Boxing : int -> Integer */
        Integer num1 = Integer.valueOf(num);

        /* AutoBoxing */
        Integer num2 = num; // 대입연산자 양쪽의 타입이 같아야 하지만 autoboxing으로 별도의 처리 필요 없음

        /* UnBoxing : Integer -> int */
        int num3 = num1.intValue();

        /* Auto UnBoxing */
        int num4 = num2;

        System.out.println(num1 == num2);   // Integer, Integer 주소값 비교
        System.out.println(num2 == num3);   // Integer, int 값 비교 (주소값 비교가 안 되므로 값 비교가 일어남)
        System.out.println(num3 == num4);   // int, int 값 비교

        // 1 [] --> [   ]
        // 2 [] --> [   ]
        // 3 [129]
        // 4 [129]

        /* Integer.valueOf() 메소드가 byte 범위의 숫자는 캐싱 처리 하고 있어 num1 == num 2가 true가 나올 수 있다. */
        // int num = 129 -> int num = 1 로 변경 시 num == 1 num 2 가 true로 바뀜
        // 바이트 범위 안일 때는 인스턴스로 생성됨(?), 그렇지 않으면 인스턴스가 별도이므로 주소값이 다름.

        /* 인스턴스의 값 비교는 항상 equals() 메소드를 사용한다. */
        System.out.println(num1.equals(num2));
    }
}
