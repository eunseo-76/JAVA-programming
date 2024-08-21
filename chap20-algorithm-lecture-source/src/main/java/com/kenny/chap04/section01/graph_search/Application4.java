package com.kenny.chap04.section01.graph_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Queue;
import java.util.StringTokenizer;

public class Application4 {

    static int N, M, V;
    static int map[][]; // 현재 그래프 상황을 mapping
    static boolean[] visit;
    static int[] visitNode; // 방문한 노드를 순서대로 담기 위한 배열 - 이렇게 하려고 했는데 stringbuilder로 하심
    static StringBuilder sb = new StringBuilder();
    Queue<Node> q;

    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static String solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   // 노드 개수
        M = Integer.parseInt(st.nextToken());   // 간선 개수
        V = Integer.parseInt(st.nextToken());   // 시작 노드 번호

        map = new int[N + 1][M + 1];
        visit = new boolean[N + 1];
        visitNode = new int[N];

        // i <= N가 아니라 i <= M 이다!
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;  // 무방향 그래프이므로 (a,b), (b,a) 둘다 표시
        }

        dfs(V);

        return null;
    }

    private static void dfs(int start) {
        visit[start] = true;
        sb.append(start);

        // 시작 노드의 이웃을 탐색
        for (int i = 1; i < N; i++) {
            if (map[start][i] == 1 && !visit[i]) {
                dfs(i);
//                visitNode[i] = i; // 답안은 배열 사용하지 않고 stringbuilder 사용
                System.out.println("visitNode[" + i + "] = " + visitNode[i]);
            }
        }
    }


    private static void bfs(int x, int y) {

    }
}
