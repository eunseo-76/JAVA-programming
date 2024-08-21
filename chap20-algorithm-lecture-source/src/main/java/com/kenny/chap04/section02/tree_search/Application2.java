package com.kenny.chap04.section02.tree_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class Application2 {
    static class Node {
        char value;
        Node left;
        Node right;

        public Node(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public class BinaryTree {
            Map<Character, Node> map;

            public BinaryTree() {
                map = new HashMap<>();
            }

            public void insertNode(char parent, char left, char right) {
                Node parentNode = map.getOrDefault(parent, new Node(parent));
                map.put(parent, parentNode);

                if (left != '.') {
                    Node leftNode = new Node(left);
                    parentNode.left = leftNode;
                    map.put(left, leftNode);
                }

                if (right != '.') {
                    Node rightNode = new Node(right);
                    parentNode.right = rightNode;
                    map.put(right, rightNode);
                }
            }
        }


        static int N;   // 노드의 수
        static int[] visited;   // 방문 여부 저장할 배열

        public static String solution(String input) throws IOException {

            BufferedReader br = new BufferedReader(new StringReader(input));
            N = Integer.parseInt(br.readLine());

            visited = new int[N + 1];

            // 인스턴스 생성
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i < N; i++) {   // 입력 한 줄 (부모 -> [자식][자식][자식])
                String a = st.nextToken();
                String b = st.nextToken();
                String c = st.nextToken();


            }

            return null;
        }
    }

}
// 이진 트리의 내용을 어떻게 담을지(리스트 배열? 2차원 배열?) 오래 고민 -> 노드 클래스 구현하라고 함 ;;