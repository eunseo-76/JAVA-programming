package com.kenny.chap02.section05.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal<T> {

    static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /* 전위 순회 메소드 (루트 -> 왼쪽 -> 오른쪽) */
    public List<T> preOrder(Node<T> root) { // 매개변수 : 탐색을 시작하고 싶은 노드
        List<T> result = new ArrayList<>();
        preOrderRec(root, result);
        return result;  // 전위 순회를 했을 때 노드의 데이터 값
    }

    // 실질적인 탐색을 담당하는 메소드
    private void preOrderRec(Node<T> root, List<T> result) {
        if (root != null) { // 가지고 있는 값이 null이 아닐 때까지 탐색
            result.add(root.data);  // 루트
            preOrderRec(root.left, result); // 왼쪽
            preOrderRec(root.right, result);    // 오른쪽
        }
    }
    // 출력문 대신 리스트에 데이터 담음

    /* 중위 순회 메소드 (왼쪽 -> 루트 -> 오른쪽) */
    public List<T> inOrder(Node<T> root) { // 매개변수 : 탐색을 시작하고 싶은 노드
        List<T> result = new ArrayList<>();
        inOrderRec(root, result);
        return result;  // 전위 순회를 했을 때 노드의 데이터 값
    }

    // 실질적인 탐색을 담당하는 메소드
    private void inOrderRec(Node<T> root, List<T> result) {
        if (root != null) { // 가지고 있는 값이 null이 아닐 때까지 탐색
            inOrderRec(root.left, result); // 왼쪽
            result.add(root.data);  // 루트
            inOrderRec(root.right, result);    // 오른쪽
        }
    }

    /* 후위 순회 메소드 (왼쪽 -> 오른쪽 -> 루트) */
    public List<T> postOrder(Node<T> root) { // 매개변수 : 탐색을 시작하고 싶은 노드
        List<T> result = new ArrayList<>();
        postOrderRec(root, result);
        return result;  // 전위 순회를 했을 때 노드의 데이터 값
    }

    // 실질적인 탐색을 담당하는 메소드
    private void postOrderRec(Node<T> root, List<T> result) {
        if (root != null) { // 가지고 있는 값이 null이 아닐 때까지 탐색
            postOrderRec(root.left, result); // 왼쪽
            postOrderRec(root.right, result);    // 오른쪽
            result.add(root.data);  // 루트
        }
    }

}
