package com.kenny.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /* StringBuilder 인스턴스 생성 */
        StringBuilder sb = new StringBuilder("java");   // stringbuilder 객체 생성
        System.out.println("sb = " + sb);   //stringbuilder에도 toString()이 오버라이딩 되어있음을 확인 가능

        System.out.println("sb.hashCode() = " + sb.hashCode());
        /* 문자열 수정 */
        sb.append("oracle");    //stringbuilder 인스턴스는 append() 를 사용해 값을 수정

        System.out.println("sb = " + sb);
        /* 기존 인스턴스와 수정 후의 인스턴스가 동일한 주소 값을 가지는 것을 확인할 수 있다.
        * 즉, 문자열을 변경했다고 해서 새로운 인스턴스가 생성된 것은 아니다. */
        System.out.println("sb.hashCode() = " + sb.hashCode());
        // stringbuilder의 hashcode는 오버라이딩 되어 있지 읺고, object의 hashcode를 가져온다(주소값 기반의 숫자 반환)
        // java 일 때와, javaoracle일 때 동일한 주소값을 가져온다는 것은 새로운 할당을 한 게 아니라는 의미

        // 문자열이 지속적으로 변경될 때는 stringbuilder를 사용하는 게 효율적이다.

    }
}
