package com.kenny.section03.grammer;

import javax.swing.*;

public class Application1 {
    public static void main(String[] args) {
        /* Enum type 메소드 */
        /* 1. values() : 열거 타입의 모든 값을 배열로 반환 */
        for (EnumType enumType : EnumType.values()) {
            System.out.println("type = " + enumType);
        }

        /* 2. valueOf() : 해당 이름을 가진 열거 타입 상수 반환 */
        for (EnumType enumType : EnumType.values()) {
            if(enumType == enumType.valueOf("JAVA"))
            System.out.println("type = " + enumType);
        }

        // 4개에 대한 인스턴스가 하나씩 만들어짐.
        // for 문에서는 4개의 객체를 반복하면서 확인함.
        // if문은 주소값이 같은지 체크한다

        /* 3. ordinal() : 열거 타입의 상수의 순서를 리턴 */
        for (EnumType enumType : EnumType.values()) {
            System.out.println("ordinal = " + enumType.ordinal());
        }

        /* 4. name() : 열거 타입의 문자열 리턴 */
        System.out.println("name = " + EnumType.ORACLE.name());
        /* 기본적으로는 toString()도 열거 타입의 문자열을 리턴하지만ㄴ 필요에 따라 오버라이딩해서 사용 가능하다. */
        System.out.println("name = " + EnumType.ORACLE.toString()); // 오버라이딩하면 이 줄과 아랫줄이 ORACLE 로 나옴
        System.out.println("name = " + EnumType.ORACLE);

    }
}
