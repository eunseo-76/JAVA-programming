package com.kenny.chap02.section05.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class TreeTraversalTest {
    private TreeTraversal<String> treeTraversal;
    private static TreeTraversal.Node<String> root;

    @BeforeAll
    static void createTreee() {


        // 문자열로 트리를 넣으면 정렬되기 때문에 임의로 트리를 만듦
        root = new TreeTraversal.Node<>("A");
        root.left = new TreeTraversal.Node<>("B");
        root.right = new TreeTraversal.Node<>("C");
        root.left.left = new TreeTraversal.Node<>("D");
        root.left.right = new TreeTraversal.Node<>("E");
        root.right.left = new TreeTraversal.Node<>("F");
        root.right.right = new TreeTraversal.Node<>("G");
    }

    @BeforeEach
    void setUp() {
        treeTraversal = new TreeTraversal<>();
    }

    static Stream<Arguments> providePreOrderTestCases() {
        return Stream.of(
            Arguments.arguments(root.left, Arrays.asList("B", "D", "E")),
            Arguments.arguments(root.right, Arrays.asList("C", "F", "G")),
            Arguments.arguments(root, Arrays.asList("A", "B", "D", "E", "C", "F", "G"))
        );
    }

    @DisplayName("전위 순회 테스트")
    @ParameterizedTest  // 파라미터로 전달받는 값을 이용해 테스트
    @MethodSource("providePreOrderTestCases")   // 위에 있는 provide.. 에서 파라미터로 전달받겠다
    void testPreOrder(TreeTraversal.Node<String> root, List<String> expected) {
        List<String> result = treeTraversal.preOrder(root); // preOrder 테스트의 경우 3가지를 테스트 함
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> provideInOrderTestCases() {
        return Stream.of(
                Arguments.arguments(root.left, Arrays.asList("D", "B", "E")),
                Arguments.arguments(root.right, Arrays.asList("F", "C", "G")),
                Arguments.arguments(root, Arrays.asList("D", "B", "E", "A", "F", "C", "G"))
        );
    }

    @DisplayName("중위 순회 테스트")
    @ParameterizedTest  // 파라미터로 전달받는 값을 이용해 테스트
    @MethodSource("provideInOrderTestCases")   // 위에 있는 provide.. 에서 파라미터로 전달받겠다
    void testInOrder(TreeTraversal.Node<String> root, List<String> expected) {
        List<String> result = treeTraversal.inOrder(root); // preOrder 테스트의 경우 3가지를 테스트 함
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> providePostOrderTestCases() {
        return Stream.of(
                Arguments.arguments(root.left, Arrays.asList("D", "E", "B")),
                Arguments.arguments(root.right, Arrays.asList("F", "G", "C")),
                Arguments.arguments(root, Arrays.asList("D", "E", "B", "F", "G", "C", "A"))
        );
    }

    @DisplayName("후위 순회 테스트")
    @ParameterizedTest  // 파라미터로 전달받는 값을 이용해 테스트
    @MethodSource("providePostOrderTestCases")   // 위에 있는 provide.. 에서 파라미터로 전달받겠다
    void testPostOrder(TreeTraversal.Node<String> root, List<String> expected) {
        List<String> result = treeTraversal.postOrder(root); // preOrder 테스트의 경우 3가지를 테스트 함
        Assertions.assertEquals(expected, result);
    }
}