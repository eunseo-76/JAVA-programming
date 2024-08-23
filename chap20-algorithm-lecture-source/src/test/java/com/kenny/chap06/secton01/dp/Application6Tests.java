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

/* 물건의 개수 : 4, 가방의 무게 7
* 물건의 무게 : 6, 물건의 가치 13
* 가방 안에 물건을 여러 개 담았을 때 가장 가치 있게 담았을 때의 값? */

public class Application6Tests {
    private static String input1;
    private static Integer output1;
    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = "4 7\n" +
                "6 13\n" +
                "4 8\n" +
                "3 6\n" +
                "5 12\n";
        output1 = 14;
    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1)
        );
    }
    @DisplayName("dp6")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void dp6test(String input, Integer output) throws Exception {
        Integer result = Application6.solution(input);
        Assertions.assertEquals(output, result);
    }
}