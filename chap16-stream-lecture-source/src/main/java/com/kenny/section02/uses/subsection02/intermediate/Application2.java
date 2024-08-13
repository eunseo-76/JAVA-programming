package com.kenny.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림 중계 연산 중 하나인 map에 대해 이해할 수 있다.
        * map : 스트림에 들어있는 데이터를 특정 람다식을 통해 가공하고 새로운 스트림에 담아주는 역할
        * 중간 연산은 여러 번 수행될 수 있다.
        * */
        IntStream intStream = IntStream.range(1, 10);
        intStream.filter(i -> i % 2 == 0).map(i -> i * 5).forEach(System.out::println);
        // filtering 해서 리턴된 intStream은 짝수 (2, 4, 6, 8)만 있음
        // map도 중계 연산. stream을 모두 쓴 게 아님. 중계 연산은 얼마든지 계속 계속 수행할 수 있음.
        // (2, 4, 6, 8)이 있는 stream을 곱하기 5해서 바꿔줌
        // forEach(): 반환된 스트림을 순회해서 출력
    }
}
