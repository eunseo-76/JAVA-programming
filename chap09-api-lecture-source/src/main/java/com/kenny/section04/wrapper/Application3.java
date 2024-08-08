package com.kenny.section04.wrapper;

public class Application3 {
    public static void main(String[] args) {
        /* parsing과 반대로 기본 자료형 값을 문자열로 변경하는 경우도 필요하다. */
        String b = Byte.valueOf((byte)1).toString();

        // String b = ((byte)1.).toString(); 기본 자료형은 객체가 아니므로 메소드 호출 할 수 없음.
        // 기본 자료형을 객체로 '감싸기 위해' valueOf를 쓰는 것!
        // Byte bbb = (byte)1;
        // String bb = bbb.toString();  // 이렇게 하면 byte -> Byte 오토 박싱한 후 문자열로 변경 가능

        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(3).toString();
        String l = Long.valueOf(4).toString();
        String f = Float.valueOf(5).toString();
        String d = Double.valueOf(6).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('A').toString();

        /* String 클래스의 valueOf() */
        String str = String.valueOf(10);

        /* 문자열 합치기를 이용해 변환 */
        String str2 = 123 + "";


    }
}
