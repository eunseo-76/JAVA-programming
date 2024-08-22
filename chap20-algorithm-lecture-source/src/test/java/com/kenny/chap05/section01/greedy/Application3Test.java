package com.kenny.chap05.section01.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Application3Test {
    private static String input1;
    private static Integer output1;

    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = "11\n" +
                "1 4\n" +   // 끝 시간이 제일 빠름
                "3 5\n" +   // 겹침
                "0 6\n" +   // 겹침
                "5 7\n" +   // 안 겹치므로 처리 가능
                "3 8\n" +   // 겹침
                "5 9\n" +   // 겹침
                "6 10\n" +  //겹침
                "8 11\n" +  // 처리 가능
                "8 12\n" +  // 겹침
                "2 13\n" +  // 겹침
                "12 14";    // 처리 가능
        output1 = 4;

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1)

        );
    }

    @DisplayName("greedy3_1")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedy3_1test(String input, Integer output) throws Exception {
        Integer result = Application3.solution(input);  // Application3_2로 바꾸어서 실행하면 확인 가능
        Assertions.assertEquals(output, result);
    }
}