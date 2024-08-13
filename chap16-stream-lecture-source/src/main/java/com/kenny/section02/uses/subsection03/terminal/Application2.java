package com.kenny.section02.uses.subsection03.terminal;

import java.sql.SQLOutput;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 reduce에 대해 이해하고 사용할 수 있다.
        * 이전 연산에서 반환된 값이 다음 연산의 첫 번째 인자로 전달된다. */
        OptionalInt reduceOneParam = IntStream.rangeClosed(1, 10)
                .reduce((a, b) -> {
                    System.out.println("a: " + a + ", b: " + b);
//                    return Integer.sum(a, b);
                    return Integer.min(a, b);
                });

        System.out.println("reduceOneParam: " + reduceOneParam);

        /* reduce에 인자를 2개 전달하는 경우 첫 번째 인자가 초기값으로 기능한다.
        * reduce의 결과 값이 반드시 존재하므로 OptionalInt 타입이 아닌 int 타입이 반환 값으로 설정 되어 있다. */
        int reduceTwoParam = IntStream.rangeClosed(1, 10)
                .reduce(100, Integer::sum); // identity, 메소드 참조 전달
        System.out.println("reduceTwoParam: " + reduceTwoParam);
        // 초기값 100이 a 역할을 함.
        // reduce( ___ ) ___ 여기를 어떻게 쓰느냐에 따라 리턴값이 int인지, Optional 인지 달라짐
    }

    // a, b 연산의 값이 다음 턴의 a로 넘어가는 규칙
    // reduce : 가지고 있는 스트림의 요소를 순회하되, 이전 연산에서 반환된 값이 다음 연산의 첫 번째 인자로 전달됨
}
