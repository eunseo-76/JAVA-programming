package com.kenny.section01.literal;
// 설정한 패키지

// 컴파일 에러: JAVA 문법이 잘못되어 컴파일이 불가능함. 빨간 줄로 표현됨.
// JAVA code(.java)는 compile을 거쳐 .class로 바뀜. 컴파일 에러 = 문법이 틀렸다는 것.
// 컴파일 에러가 나면(빨간 줄 생기면) 실행 절대 못 함. 실행해 볼 필요 없이 문법 고쳐야 함.

// 한 줄 주석
/* 여러
 * 줄
 * 주석 */

// 클래스 이름은 여기로 들어감
public class Application1 {
// 중괄호 {} 짝을 잘 맞춰주어야 한다
    public static void main(String[] args) {
        // main 자동완성으로 생성 가능

        // 여러 가지 형태의 값을 출력 할 수 있다.
        /* 범위 주석 쓰고 나갈려면 shift + enter */
        System.out.print("Hello World!");
        System.out.println("Hello World!");
        System.out.print("Hello World!"); // 출력 후 개행 안 함
        System.out.println("Hello World!"); //출력 후 개행

        // 콘솔에 Hello World 출력

        // ctrl + d 한 줄 복사
        // shift + f10 : 방금 실행한 것을 다시 실행(파일 변경했을 시 current file로 바꿔야 함)
        // 혹은 코드에 초록색 삼각형 눌러서 실행

        // 1. 숫자 형태의 값
        // 1-1. 정수
        //sout 으로 System.out.println(); 자동완성 가능
        System.out.println(123); // 정수형 리터럴
        // 1-2. 실수
        System.out.println(1.23);   // 실수형 리터럴

        // 2. 문자 형태의 값
        System.out.println('a');			     //문자 형태의 값은 홑따옴표(single-quotation)으로 감싸주어야 한다.
        //System.out.println('ab');			   //두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
        //System.out.println('');			     //아무 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1');			     //숫자 값 이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다. 숫자 1 아님!
        System.out.println(' ');                // 이건 또 되네

        // 3. 문자열 형태의 값
        System.out.println("안녕하세요");		//문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸주어야 한다.
        System.out.println("123");			    //정수 이지만 쌍따옴표로 감싸져있기 때문에 문자열로 보아야 한다.
        System.out.println("");				      //아무 값도 없는 빈 쌍따옴표도 문자열로 취급한다.
        // 노란색은 경고. 컴파일 에러와는 상관없음. 그냥 너 아무것도 안 썼는데 괜찮냐고 물어보는 것
        System.out.println("a");			      //한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (문자 a인 'a' 와는 다르다)
        System.out.println(" ");

        // 4. 논리 형태의 값
        System.out.println(true);
        System.out.println(false);			    //true 혹은 false 값을 논리형이라고 한다.


    }
}
