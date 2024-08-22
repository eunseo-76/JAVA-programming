package com.kenny.chap05.section01.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Application4Tests {

    private static String input1;
    private static String output1;

    @BeforeAll
    public static void set() {

        input1 = "6 9 1\n" +    // 노드, 엣지, 시작 노드
                "1 2 12\n" +    // 노드1, 노드2, 가중치
                "1 3 4\n" +
                "2 1 2\n" +
                "2 3 5\n" +
                "2 5 5\n" +
                "3 4 5\n" +
                "4 2 2\n" +
                "4 5 5\n" +
                "6 4 5\n";
        output1 = "11 4 9 14 impossible";
        // 시작 노드에서 다른 노드들까지 가는데 드는 가중치의 합 (못 가면 impossible)
    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1)
        );
    }

    @DisplayName("Dijkstra Algorithm Test")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void dijkstraAlgorithmTest(String input, String output) throws IOException {
        String result = Application4.solution(input);
        Assertions.assertEquals(output, result);
    }
}