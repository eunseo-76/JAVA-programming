package com.kenny.chap06.secton01.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    static Stream<Arguments> provideSource() {
        return Stream.of(
                Arguments.arguments(10, 55),    // 10번째 항
                Arguments.arguments(40, 102334155)  // 40번째 항
        );
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    @DisplayName("기본 재귀 피보나치")
    void testGetFibonacciNumber(int input, int output) {
        Integer result = Fibonacci.getFibonacciNumber(input);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    @DisplayName("DP - TopDown")
    void testGetFibonacciNumberDp(int input, int output) {
        Integer result = Fibonacci.getFibonacciNumberDp(input);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    @DisplayName("DP - BottumUp")
    void testGetFibonacciNumberIter(int input, int output) {
        Integer result = Fibonacci.getFibonacciNumberIter(input);
        Assertions.assertEquals(output, result);
    }

}