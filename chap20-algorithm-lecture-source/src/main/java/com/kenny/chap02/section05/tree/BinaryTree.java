package com.kenny.chap02.section05.tree;

/* 이진 트리 예제 */
public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root; // 트리의 루트 노드

    // 노드 클래스
    private static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        // 자기 자신과 왼쪽, 오른쪽 데이터를 참조 가능
        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 요소 추가 (이진 탐색 트리 규칙에 따라 추가)
    public void insert(T data) {
        root = insertRec(root, data);
    }


    // root 기준으로 데이터를 어디에 넣을지

    private Node<T> insertRec(Node<T> root, T data) {
        // 아무것도 없었으면 root 노드에 추가
        if (root == null) {
            root = new Node<>(data);
            return root;
        }

        // 뭔가 있었으면
        if (data.compareTo(root.data) < 0) { // 데이터가 현재 노드의 데이터보다 작으면 왼쪽 서브트리로 이동
            root.left = insertRec(root.left, data); // 3 1 비교
        } else { // 데이터가 현재 노드의 데이터보다 크면 오른쪽 서브트리로 이동
            root.right = insertRec(root.right, data);   // 재귀
            // root 5 - 3 연결되어 있을 때, 1을 삽입하는 경우
            // 3과 1 비교
            // 왼쪽으로 갈 지 오른쪽으로 갈 지 계속 비교하기 위해 재귀 호출
        }
        return root;
    }

    // 요소 탐색 (이진 탐색 트리 규칙에 따라 탐색)
    public boolean search(T data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node<T> root, T data) {
        if (root == null) return false;
        if (root.data.equals(data)) return true;
        if (data.compareTo(root.data) < 0) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

}
