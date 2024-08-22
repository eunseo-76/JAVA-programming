package com.kenny.chap04.section02.tree_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class Application2 {
    static class Node {
        char left;
        char right;

        Node(char left, char right) {
            this.left = left;
            this.right = right;
        }
    }

    static Node[] tree = new Node[26]; // A~Z 총 26개의 노드
    static StringBuilder sb = new StringBuilder();

    public static String solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            tree[parent - 'A'] = new Node(left, right);
        }

        preorder('A');
        sb.append("\n");
        inorder('A');
        sb.append("\n");
        postorder('A');
        return sb.toString();
    }

    static void preorder(char current) {
        if (current == '.') return;
        sb.append(current);
        preorder(tree[current - 'A'].left);
        preorder(tree[current - 'A'].right);
    }

    static void inorder(char current) {
        if (current == '.') return;
        inorder(tree[current - 'A'].left);
        sb.append(current);
        inorder(tree[current - 'A'].right);
    }

    static void postorder(char current) {
        if (current == '.') return;
        postorder(tree[current - 'A'].left);
        postorder(tree[current - 'A'].right);
        sb.append(current);
    }
}


// 이진 트리의 내용을 어떻게 담을지(리스트 배열? 2차원 배열?) 오래 고민 -> 노드 클래스 구현야함
// 노드 클래스를 구현해서 이진 트리의 좌, 우를 받고 노드의 배열로 트리 내용을 담는다 <- 흠... 직관적으로는 알겠는데 어렵...


// parent, left, right 세 개를 잘라서 받아야 한다.
// 알파벳과 숫자 인덱스를 매칭시키기 위해 parent - 'A' 해서 숫자로 매칭시킴
// tree 클래스에 노드의 왼쪽, 오른쪽을 저장함
// A라는 루트 노드에서부터 전위/중위/후위 순회 함