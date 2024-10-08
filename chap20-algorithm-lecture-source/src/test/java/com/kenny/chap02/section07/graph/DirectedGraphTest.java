package com.kenny.chap02.section07.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DirectedGraphTest {

    private DirectedGraph<Integer> graph;

    @BeforeEach
    void setUp() {  // 테스트용 데이터 setUp
        graph = new DirectedGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
    }

    /*
     * 1 → 2 → 5
     * ↓     ↘
     * 3 → 4 → 6
     * */

    // 이 그래프를 스택 or 재귀함수로 DFS 구현

    static Stream<Arguments> provideForDfsStack() {
        // 스택
        // 1 (push) -> 1 (pop)
        // 2 3 (push) -> 3 (pop)   // 2 3 중 어디로 갈래? 했을 때 3으로 먼저 가는 그래프
        // 2 4 (push) -> 4 (pop)
        // 2 6 (push) -> 6 (pop)
        // 2 -> 2 (pop)
        // 5 (push)-> 5 (pop)
        return Stream.of(
                Arguments.arguments(1, Arrays.asList(1, 3, 4, 6, 2, 5))
        );
    }

    @ParameterizedTest
    @MethodSource("provideForDfsStack")
    void testDfsStack(Integer start, List<Integer> expected) {
        List<Integer> result = graph.dfsUsingStack(start);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> provideForDfsRecursive() {
        return Stream.of(
                Arguments.arguments(1, Arrays.asList(1, 2, 5, 6, 3, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("provideForDfsRecursive")
    void testDfsRecursive(Integer start, List<Integer> expected) {
        List<Integer> result = graph.dfsUsingRecursion(start);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> provideForBfs() {
        return Stream.of(
                Arguments.arguments(1, Arrays.asList(1, 2, 3, 5, 6, 4))
        );
        // 큐
        // 1
        // 3 2 1
        // 6 5 3 2 1
        // 4 6 5 3 2 1
    }

    @ParameterizedTest
    @MethodSource("provideForBfs")
    void testBfs(Integer start, List<Integer> expected) {
        List<Integer> result = graph.bfsUsingQueue(start);
        Assertions.assertEquals(expected, result);
    }

    // hasPathDFS 메소드 =====
    static Stream<Arguments> provideForHasPathDFS() {
        return Stream.of(
                Arguments.arguments(1, 2, true),
                Arguments.arguments(1, 4, true),
                Arguments.arguments(2, 3, true),
                Arguments.arguments(5, 6, true),
                Arguments.arguments(2, 5, false),
                Arguments.arguments(3, 6, false)
        );
    }

    // 이미 setUp이 방향 그래프이기 때문에 방문 못 하는 노드가 있음. 그래프 새로 만들 필요 없다.

    @ParameterizedTest
    @MethodSource("provideForHasPathDFS")
    void testHasPathDFS(Integer start, Integer end, boolean expected) {
        DirectedGraph<Integer> newGraph = new DirectedGraph<>();
        newGraph.addVertex(1);
        newGraph.addVertex(2);
        newGraph.addVertex(3);
        newGraph.addVertex(4);
        newGraph.addVertex(5);
        newGraph.addVertex(6);

        newGraph.addEdge(1, 2);
        newGraph.addEdge(2, 4);
        newGraph.addEdge(1, 3);
        newGraph.addEdge(5, 6);

        List<Integer> visited = new ArrayList<>();
        boolean result = newGraph.hasPathDFS(start, end, visited);
        Assertions.assertEquals(expected, result);
    }

}