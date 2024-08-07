package com.kenny.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        /* StringBuilder의 자주 사용하는 메소드 */
        StringBuilder sb1 = new StringBuilder();
        /* 용량(현재 버퍼의 크기)를 정수형으로 반환하며 문자열 길이 + 16이 기본 값 */
        System.out.println(sb1.capacity());
        // capacity() : stringbuilder로 문자열을 담았을 때 몇 개를 담을 수 있을지
        // 아무것도 담지 않으면 16

        for (int i = 0; i < 50; i++) {
            /* 인자로 전달 된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다. */
            sb1.append(i);
            System.out.println("sb1: " + sb1);
            System.out.println("sb1.capacity(): " + sb1.capacity());    // 용량이 꽉 차면 2n + 2 씩 증가함
            System.out.println("sb1.hashCode(): " + sb1.hashCode());    // 할당되었던 주소값은 변화하지 않음

            // 용량이 꽉 차도 처음 할당받은 주소값은 변화하지 않음. 단, 다른 공간을 할당받아 참조할 수 있음.
        }

        StringBuilder sb2 = new StringBuilder("javaoracle");
        System.out.println("sb2 = " + sb2);
        System.out.println("delete() : " + sb2.delete(2, 5));
        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));
        System.out.println("sb2 = " + sb2);

        System.out.println("insert() : " + sb2.insert(1, "vao"));
        System.out.println("insert() : " + sb2.insert(0, "j"));
        System.out.println("insert() : " + sb2.insert(sb2.length(), "jabc"));

        System.out.println("reverse() : " + sb2.reverse());

        /* String 클래스와 동일하게 charAt(), indexOf(), lastIndexOf(), length(), replace(), substring(), toString()
        * 등의 메소드가 있다. */
    }
}
