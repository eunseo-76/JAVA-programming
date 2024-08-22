package com.kenny.chap05.section01.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 최소 신장 트리
* 주어진 그래프의 모든 정점을 연결하는 부분 그래프 중 "가중치의 값이 최소"인 트리
* 크루스칼 알고리즘
* 간선을 오름차순으로 정렬하고, 사이클을 형성하지 않도록 최소 신장 트리를 구성하는 방법
* (union & find 자료구조를 통해 사이클 여부 확인
*  */
public class Application6 {
    static int[] parent;

    // 간선 정보 클래스
    static class Edge implements Comparable<Edge> {
        int u, v, weight;   // 정점1, 정점2, 가중치
        Edge(int u, int v, int weight) {
            this.u = u; // 정점1
            this.v = v; // 정점2
            this.weight = weight;   // 가중치
        }

        @Override
        public int compareTo(Edge o) {  // 간선 정렬 시 가중치 오름차순 적용
            return this.weight - o.weight;
        }
    }

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



    public static Long solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());   // 정점
        int E = Integer.parseInt(st.nextToken());   // 엣지

        Edge[] edges = new Edge[E];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edges[i] = new Edge(u, v, weight);
            // Edge 클래스에 들어오는 정보를 하나의 객체로 만들어 모두 넣었다. <- 이거 맨날 헷갈림
        }

        // 가중치 오름차순으로 간선 정렬
        Arrays.sort(edges);

        parent = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            parent[i] = i;  // 각각의 정점이 본인만의 그룹에 들어가도록 함
        }

        long totalWeight = 0L;

        /* 가중치가 가장 작은 간선부터 선택해나가는 작업 */
        for (Edge edge : edges) {
            /* 각각의 정점이 연결되어 있는지 확인 (같은 집합이면 이미 연결된 정점) */
            if (find(edge.u) != find(edge.v)) { // 같은 집합이 아니면 연결
                // 정점을 연결 -> 같은 집합이 된다.
                union(edge.u, edge.v);
                totalWeight += edge.weight;
            }
        }
        return totalWeight;
    }

}
