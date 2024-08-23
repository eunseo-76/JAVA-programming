package com.kenny.chap06.secton01.dp;

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


public class Application7Tests {
    private static String input1, input2, input3;
    private static Integer output1, output2, output3;
    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = "6\n" +
                "10 20 10 30 20 50";    // 10->20, 20 ->30, 30->50 즉 10, 20, 30, 50 4개
        output1 = 4;

        input2 = "9\n" +
                "10 22 9 33 22 50 41 60 80";    // 10->22, 33->50, 50->60, 60->80
        output2 = 6;

        input3 = "2\n" +
                "3 2";  // 증가 패턴 없으면 1 반환
        output3 = 1;
    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1),
                arguments(input2, output2),
                arguments(input3, output3)
        );
    }
    @DisplayName("dp7")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void dp6test(String input, Integer output) throws Exception {
        Integer result = Application7.solution(input);
        Assertions.assertEquals(output, result);
    }
}