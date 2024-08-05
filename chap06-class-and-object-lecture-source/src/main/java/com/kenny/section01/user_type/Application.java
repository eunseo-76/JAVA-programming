package com.kenny.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 사용자 정의 자료형 사용하기 */

        /* 변수 선언 및 객체 생성
        * 클래스명 변수명 = new 클래스명() <- 객체(instance)를 생성하는 구문
        * 사용자 정의 자료형인 클래스를 사용하기 위해서는 new 연산자로 heap 영역에 할당을 해야한다.
        * 객체를 생성하게 되면 클래스에 정의한 필드(전역변수)와 메소드 대로 객체가 생성된다. */
        Member member = new Member();   //다른 클래스에 있는 메소드를 호출할 때 쓰던 구문. 객체instance를 생성하는 구문.
        // new: heap 영역에 공간을 할당하고 할당받은 주소값을 반환해주는 역할.
        // stack 영역에 member라는 레퍼런스 변수를 선언하고, heap 영역에 member에 정의한 내용을 할당받음


        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 18;
        member.gender = 'M';
        member.hobby = new String[] {"축구", "야구", "코딩"};

        /* 필드에 접근하기 위해 레퍼런스 변수명.필드명 으로 접근한다.
        * '.'은 참조 연산자라고 하는데, 레퍼런스 변수가 참조하는 주소로 접근한다는 의미를 가진다.
        * heap 영역은 기본적으로 JVM 초기값으로 초기화 된다. */
        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + Arrays.toString(member.hobby));   //member.hobby는 배열의 주소값을 출력함. 내용 보고 싶으면 for문 혹은 배
        // 점(.)은 참조 연산자. member는 주소값을 의미하는데, 이 주소를 참조하여 필드 영역(id, pwd, ...)에 접근한다
        // 할당만 하고 아무것도 대입하지 않으면 JVM 기본값이 출력됨.
        // String : null, int: 0...
        // char는 유니코드 0000 이 출력됨



    }
}
