package com.kenny.chap05.section01.greedy;

/* 최소 신장 트리
* 주어진 그래프의 모든 정점을 연결하는 부분 그래프 중 "가중치의 값이 최소"인 트리
* 크루스칼 알고리즘
* 간선을 오름차순으로 정렬하고, 사이클을 형성하지 않도록 최소 신장 트리를 구성하는 방법
* (union & find 자료구조를 통해 사이클 여부 확인
*  */
public class Application6 {
    static int[] parent;

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    static void union(int x, int y) {
        // 두 개가 같은 그룹인지 확인
        int rootX = find(x);
        int rootY = find(y);
        // 앞쪽 원소를 root로 하는 기준으로 작성
        if (rootX != rootY) {   // 같은 그룹이 아니면
            parent[rootY] = rootX;  //
        }
    }

    public static Long solution(String input) {

        return null;
    }

}
