package com.kenny.section01.literal;

// 클래스
public class Application2 {
    //메소드
    //클래스 - 메소드를 tab으로 맞춰줘야 한다
    public static void main(String[] args) {
        /* 값을 연산하여 출력할 수 있다.
        * 이 때, 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.
         */

        // 1. 숫자와 숫자의 연산
        System.out.println("===== 정수와 정수 =====");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);   // 나누기의 몫
        System.out.println(123 % 10);   // 모드 연산자 : 나누기의 나머지

        System.out.println("===== 실수와 실수 =====");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);			//약간의 오차가 생긴다 0.23이 아니라 0.229999...
        // 컴퓨터는 실수 저장 시 부동소수점으로 저장하기 때문에 오차 발생.
        // 더 넓은 범위의 값을 약간 부정확하게 저장.
        // 정확한 계산이 필요하면 실수 리터럴이 아니라 decimal 같은 타입을 사용해야 함.

        System.out.println("===== 정수와 실수 =====");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 컴퓨터는 같은 타입끼리만 계산 가능.
        // 이 둘은 같은 타입이 아닌데 연산이 되는 이유?
        // 내부적으로 정수->실수 변경 후 실수와 실수 간의 연산이 진행됨

        // 2. 문자와 문자의 연산
        System.out.println("===== 문자와 문자 =====");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        // 문자 -> 숫자 변경되어 숫자끼리의 연산이 일어남
        // 각 문자가 ASCII 코드와 매칭되기 때문

        System.out.println("===== 문자와 정수 =====");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("===== 문자와 실수 =====");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 3. 문자열 리터럴의 연산

        //더하기만 가능
        System.out.println("===== 문자열과 문자열 =====");
        System.out.println("hello" + "world");
        // 문자열은 숫자로 변경되는 게 아니라, 앞 뒤의 문자가 붙어서 처리된다고 생각.
        //System.out.println("hello" - "world");			//에러 발생
        //System.out.println("hello" * "world");			//에러 발생
        //System.out.println("hello" / "world");			//에러 발생
        //System.out.println("hello" % "world");			//에러 발생

        System.out.println("===== 문자열과 다른 리터럴 =====");
        // 문자열과 붙으면 최종 형태는 '문자열'이다!
        System.out.println("hello" + "world");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");

        // 4. 논리 값의 연산
        // 논리 값의 연산은 논리 + 문자열 빼고 다 안 된다

        //System.out.println(true + false);				//에러 발생
        //System.out.println(true - false);				//에러 발생
        //System.out.println(true * false);				//에러 발생
        //System.out.println(true / false);				//에러 발생
        //System.out.println(true % false);				//에러 발생

        //System.out.println(true + 1);				//에러 발생
        //System.out.println(true - 1);				//에러 발생
        //System.out.println(true * 1);				//에러 발생
        //System.out.println(true / 2);				//에러 발생
        //System.out.println(true % 2);				//에러 발생

        //System.out.println(true + 1.0);				//에러 발생
        //System.out.println(true - 1.0);				//에러 발생
        //System.out.println(true * 1.0);				//에러 발생
        //System.out.println(true / 2.0);				//에러 발생
        //System.out.println(true % 2.0);				//에러 발생

        //System.out.println(true + 'a');				//에러 발생
        //System.out.println(true - 'a');				//에러 발생
        //System.out.println(true * 'a');				//에러 발생
        //System.out.println(true / 'a');				//에러 발생
        //System.out.println(true % 'a');				//에러 발생

        System.out.println(true + "a");		  		//문자열 합치기 됨
        //System.out.println(true - "a");				//에러 발생
        //System.out.println(true * "a");				//에러 발생
        //System.out.println(true / "a");				//에러 발생
        //System.out.println(true % "a");				//에러 발생




    }
}
