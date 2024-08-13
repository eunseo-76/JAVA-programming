package com.kenny.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 sorted에 대해 이해하고 사용할 수 있다. */
        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
                .boxed()
                .sorted((a, b) -> b - a)   // 기본 정렬기준: 오름차순. 이걸 내림차순으로 정렬하고 싶은 경우
                .toList();
        System.out.println(integerList);
    }
    // compare 메소드를 람다식으로
}
