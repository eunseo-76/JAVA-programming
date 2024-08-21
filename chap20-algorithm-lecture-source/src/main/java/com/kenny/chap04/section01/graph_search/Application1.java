package com.kenny.chap04.section01.graph_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/* DFS(재귀함수)를 활용하는 예제를 이해할 수 있다. */
public class Application1 {

    static int node, edge;
    static int[][] map; // 현재 그래프 상황을 mapping
    static boolean[] visit; // 방문 여부 판단
    static int count = 0;   // 바이러스에 걸린 컴퓨터 카운트

    public static Integer solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        // 2차원 배열에 mapping
        /* 노드와 간선의 정보를 담을 map (노드의 개수와 번호에 기반한 int 배열 */
        map = new int[node + 1][edge + 1];  // 0번 인덱스 제외하고 사용

        /* 방문 배열 생성 (지나간 노드를 다시 방문하지 않기 위함 - stackoverflow 방지) */
        visit = new boolean[node + 1];  // 0번 인덱스 제외하고 사용

        StringTokenizer st;
        /* map 내부에 그래프 정보 작성 */
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            /* 무방향 그래프의 경우 양쪽에 표시해 두어야 함 */
            // 무방향 그래프는 2차원 배열에서 양쪽 모두 표시해야 함 (1, 2 노드가 연결되어 있다면 (1, 2) (2, 1) 모두 1로 표시
            map[a][b] = map[b][a] = 1;
        }

        dfs(1); // 1번부터 탐색

        return count;
    }

    /* 재귀 함수로 dfs 알고리즘을 구현할 메소드 */
    private static void dfs(int start) {
        /* start 정점을 방문 했다는 표시 */
        visit[start] = true;

        /* start의 이웃을 탐색하는 과정 */
        for (int i = 1; i <= node; i++) {
            /* start 정점의 이웃 중 방문하지 않은 이웃을 찾는다. */
            if (map[start][i] == 1 && !visit[i]) {
                count++;
                dfs(i);
            }
        }
    }
}
