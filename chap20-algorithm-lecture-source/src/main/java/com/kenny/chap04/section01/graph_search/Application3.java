package com.kenny.chap04.section01.graph_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* BFS와 방문 배열을 활용한 최단거리 문제를 해결할 수 있다. */
public class Application3 {

    static int[][] map;
    static boolean[][] visit;
    static int N, M;    // 가로, 세로

    /* 상하좌우 개념의 좌표 배열들 */
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};

    //
    static Queue<Node> q;

    //
    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char[] ch = st.nextToken().toCharArray();   // 한 줄만 읽어서 char 배열로 바꿈
            for (int j=0; j<M; j++) {
//                map[i][j] = ch[j] - '0';  // char -> 숫자 변환 방법(1)
                // '0'은 ascii로 48이다.
                // '1' 은 49 이므로, 49 - 4 = 숫자 1
                // '0' 은 48 이므로, 48 -48 = 숫자 0
                // 이런 식으로 char 문자를 숫자로 변환할 수 있다.
                map[i][j] = Character.getNumericValue(ch[j]);   // char -> 숫자 변환 방법(2) : '1' -> 숫자 1
            }
        }

        bfs(0, 0);  // (0, 0)부터 맨 끝까지 도착할 때까지 탐색.

        /* 도착지의 값을 반환 (도착할 때까지의 최적의 경로 단계 수) */
        return map[N - 1][M - 1];
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        visit[x][y] = true;

        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            Node n = q.poll();  // 현재 노드의 위치

            /* 해당 정점에서 상하좌우를 살펴보는 반복문 */
            for (int i = 0; i < 4; i++) {
                int curx = n.x + dirX[i];
                int cury = n.y + dirY[i];

                /* 좌표가 전체 범위를 넘어간다면 확인이 불필요하므로 다음 방향 확인 */
                if (curx < 0 || cury < 0 || curx >= N || cury >= M) continue;   // 조건 충족하여 continue 만나면 for 반복문의 i++ 증가

                /* 방문했던 좌표이거나 벽이면 확인이 불필요하므로 다음 방향 확인 */
                if (visit[curx][cury] || map[curx][cury] == 0) continue;

                q.offer(new Node(curx, cury));  // 큐에 데이터 넣어서 다음 탐색할 수 있게 함
                visit[curx][cury] = true;
                map[curx][cury] = map[n.x][n.y] + 1;

                System.out.println("curx = " + curx + ", cury = " + cury);
                System.out.println("map[curx][cury] = " + map[curx][cury]);
            }
        }
    }
}
