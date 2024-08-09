package com.kenny.section01.generic;

/* 제네릭 선언은 다이아몬드 연산자를 이용하여 작성한다.
영문자는 관례 상 대문자로 작성하며 T는 타입 변수라고 부른다. // 보통 T를 쓰지만 아무거나 가능
* 가상으로 존재하는 타입으로 T가 아닌 다른 영문자를 사용해도 무방하며
여러 개의 타입 변수를 작성할 때는 , 를 이용하여 기술할 수 있다. */
public class GenericTest <T> {

    private T value;

    // value가 int 였으면 int를, String 이었으면 String을 처리
    public void setValue(T value) {
        this.value = value;
    }

    // 가상의 타입 T 반환
    public T getValue() {
        return value;
    }

}
